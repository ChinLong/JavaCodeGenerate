package cn.com.chinlong.generate.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.common.Constant.TemplateConfig;
import cn.com.chinlong.generate.entity.ClassBean;
import cn.com.chinlong.generate.entity.ClassColumnBean;
import cn.com.chinlong.generate.entity.TableColumnEntity;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.utils.JdbcType2JavaType;
import cn.com.chinlong.utils.PropertyUtils;
import cn.com.chinlong.utils.StringUtils;

public class Table2Entity {

	/**
	 * 将
	 * 
	 * @param sheetNameList
	 * @return
	 */
	public static final ClassBean table2Entity(TableEntity table) {
		Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
		String packageValue = p.getProperty(TemplateConfig.ENTITY_PACKAGE);
		boolean underscoreToCamel = Boolean.parseBoolean(p.getProperty(TemplateConfig.UNDERSCORE_TO_CAMEL_CASE));
		ClassBean entity = new ClassBean();
		
		String tempItem = null;
		List<ClassColumnBean> classColumnList = null;
		List<TableColumnEntity> tableColumnList = null;

		if (null == table) {
			return new ClassBean();
		}
		tempItem = table.getTableName();

		entity.setClassName(StringUtils.upperFirstCase(StringUtils.underscoreToCamel(tempItem)));
		entity.setPackageValue(packageValue);
		// entity.setFatherClassName("Father");
		entity.setToString(true);

		tableColumnList = table.getColumnList();
		if (null == tableColumnList) {
			tableColumnList = new ArrayList<TableColumnEntity>();
		}
		classColumnList = new ArrayList<ClassColumnBean>();
		Map<String, String> importMap = new HashMap<>();
		Class<?> clazz = null;
		for (TableColumnEntity tableColumn : tableColumnList) {
			ClassColumnBean classColumn = new ClassColumnBean();
			if (underscoreToCamel) {
				classColumn.setColumnName(StringUtils.underscoreToCamel(tableColumn.getColumnName()));
			} else {
				classColumn.setColumnName(tableColumn.getColumnName().toLowerCase());
			}
			classColumn.setColumnRemark(tableColumn.getColumnNameDesc());
			clazz = JdbcType2JavaType.jdbcTypeToJavaType(JdbcType2JavaType.getJdbcCode(tableColumn.getColumnDataType().toUpperCase()));
			classColumn.setColumnDataType(clazz.getSimpleName());
			importMap.put(clazz.getSimpleName(), clazz.getName());
			classColumn.setColumnDefaultValue(getDefaultValueToString(classColumn.getColumnDataType(), classColumn.getColumnDefaultValue()));

			// List<String> annotationList = new ArrayList<String>();
			// annotationList.add("Table");
			// annotationList.add("Colum");
			// classColumn.setColumnAnnotationList(annotationList);

			classColumnList.add(classColumn);
		}
		entity.setColumnList(classColumnList);
		tempItem = "String";
		if (null != importMap.get(tempItem)) {
			importMap.remove(tempItem);
		}
		entity.setImportList(new ArrayList<String>(importMap.values()));

		// List<String> interfaceList = new ArrayList<String>();
		// interfaceList.add("ConeAble");
		// interfaceList.add("List");
		// entity.setInterfaceList(interfaceList);

		List<String> commentList = new ArrayList<String>();
		commentList.add(StringUtils.safeTrim(table.getTableNameDesc()));
		commentList.add("@author ChinLong");
		entity.setRemarkList(commentList);

		return entity;
	}

	private static final String getDefaultValueToString(String className, String defaultValue) {
		if (StringUtils.isEmpty(defaultValue)) {
			return null;
		}
		switch (className) {
		case "Integer":
			defaultValue += "L";
			break;
		case "String":
			defaultValue = "\"" + defaultValue + "\"";
			break;
		case "Date":
			defaultValue = "new Date()";
			break;
		case "Byte":
			defaultValue = "'" + defaultValue + "'";
			break;
		default:
			defaultValue = null;
			break;
		}
		return defaultValue;
	}
}
