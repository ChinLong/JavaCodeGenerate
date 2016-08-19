package cn.com.chinlong.generate.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.chinlong.common.Constant.ExcelConfig;
import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.common.Constant.Sign;
import cn.com.chinlong.common.Constant.TemplateConfig;
import cn.com.chinlong.generate.entity.ClassBean;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.generate.util.ExcelUtil;
import cn.com.chinlong.generate.util.IDataBaseUtil;
import cn.com.chinlong.generate.util.MySqlDataBaseUtil;
import cn.com.chinlong.generate.util.Table2Entity;
import cn.com.chinlong.utils.Dto2Map;
import cn.com.chinlong.utils.FileUtils;
import cn.com.chinlong.utils.FreeMarkerUtils;
import cn.com.chinlong.utils.PropertyUtils;
import cn.com.chinlong.utils.StringUtils;

@Service()
public class GenerateService {

	// @Autowired
	private IDataBaseUtil dataBaseUtil = new MySqlDataBaseUtil();

	/**
	 * 查询数据库所有表
	 * 
	 * @return
	 */
	public List<TableEntity> readAllTables() {
		List<TableEntity> tableList = dataBaseUtil.getAllTableNames();
		return tableList;
	}

	/**
	 * 读取excel汇总数据
	 * 
	 * @param tableName
	 * @return
	 */
	public List<TableEntity> readExcelData() {
		return ExcelUtil.readTableEntity();
	}

	/**
	 * 读取excel能生成的数据
	 * 
	 * @param tableName
	 * @return
	 */
	public List<TableEntity> readExcelSheets() {
		List<TableEntity> tableList = new ArrayList<TableEntity>();
		try {
			// 读取配置
			Properties p = PropertyUtils.getProperty(Resource.EXCEL_FILENAME);
			Workbook wb = WorkbookFactory.create(new File(p.getProperty(ExcelConfig.EXCEL_PATH)));
			int sheetCount = wb.getNumberOfSheets();
			int startSheet = Integer.parseInt(p.getProperty(ExcelConfig.START_SHEET));
			Sheet sheet = null;
			TableEntity table = null;
			String tableNameDesc = null;
			// 表名
			String[] tableNamePositionArray = p.getProperty(ExcelConfig.TABLE_NAME_POSITION).split(Sign.COMMA);
			// 表备注
			String[] tableNameDescPositionArray = p.getProperty(ExcelConfig.TABLE_NAME_DESC_POSITION).split(Sign.COMMA);
			if (startSheet < sheetCount) {
				for (int i = startSheet; i < sheetCount; i++) {
					sheet = wb.getSheetAt(i);
					table = new TableEntity();
					table.setTableName(sheet.getSheetName());
					tableNameDesc = sheet.getRow(Integer.parseInt(tableNameDescPositionArray[0])).getCell(Integer.parseInt(tableNameDescPositionArray[1])).getStringCellValue();
					if (sheet.getSheetName().equalsIgnoreCase(tableNameDesc)) {
						table.setTableNameDesc(sheet.getRow(Integer.parseInt(tableNamePositionArray[0])).getCell(Integer.parseInt(tableNamePositionArray[1])).getStringCellValue());
					} else {
						table.setTableNameDesc(tableNameDesc);
					}
					tableList.add(table);
				}
			}
		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		return tableList;
	}

	/**
	 * Excel生成Entity
	 * 
	 * @param params
	 */
	public boolean createEntityFromExcel(List<String> sheetNameList) {
		boolean result = true;
		try {
			Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
			String path = p.getProperty(TemplateConfig.ENTITY_PACKAGE);
			String[] strArray = path.split(Sign.POINT);
			StringBuffer sb = new StringBuffer();
			sb.append(p.getProperty(TemplateConfig.PROJECT_PATH));
			for (String str : strArray) {
				sb.append(str);
				sb.append(File.separator);
			}
			path = sb.toString();
			FileUtils.mkDir(new File(path));
			ClassBean classBean = null;
			for (String sheetName : sheetNameList) {
				classBean = Table2Entity.table2Entity(ExcelUtil.readExcelSheet(sheetName));
				FreeMarkerUtils.writeTemplete(p.getProperty(TemplateConfig.TEMPLATE_PATH), p.getProperty(TemplateConfig.ENTITY_TEMPLATE_NAME), Dto2Map.po2Map(classBean), path, classBean.getClassName() + ".java");
			}
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Table生成Entity
	 * 
	 * @param params
	 */
	public boolean createEntityFromTable(List<String> tableNameList) {
		boolean result = true;
		try {
			Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
			String path = p.getProperty(TemplateConfig.ENTITY_PACKAGE);
			String[] strArray = path.split(Sign.POINT);
			StringBuffer sb = new StringBuffer();
			sb.append(p.getProperty(TemplateConfig.PROJECT_PATH));
			for (String str : strArray) {
				sb.append(str);
				sb.append(File.separator);
			}
			path = sb.toString();
			FileUtils.mkDir(new File(path));
			ClassBean classBean = null;
			for (String tableName : tableNameList) {
				classBean = Table2Entity.table2Entity(dataBaseUtil.getTableInfo(tableName));
				FreeMarkerUtils.writeTemplete(p.getProperty(TemplateConfig.TEMPLATE_PATH), p.getProperty(TemplateConfig.ENTITY_TEMPLATE_NAME), Dto2Map.po2Map(classBean), path, classBean.getClassName() + ".java");
			}
			if (StringUtils.isEmpty(path)) {
				path = File.separator;
			}
			FreeMarkerUtils.writeTemplete(p.getProperty(TemplateConfig.TEMPLATE_PATH), p.getProperty(TemplateConfig.ENTITY_TEMPLATE_NAME), Dto2Map.po2Map(classBean), path, classBean.getClassName() + ".java");
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 生成Sql
	 * 
	 * @param params
	 */
	public boolean createSqlFromExcel(List<String> sheetNameList) {
		boolean result = true;
		try {
			Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
			TableEntity table = null;
			String path = p.getProperty(TemplateConfig.SQL_PATH);
			FileUtils.mkDir(new File(path));
			for (String sheetName : sheetNameList) {
				table = ExcelUtil.readExcelSheet(sheetName);
				FreeMarkerUtils.writeTemplete(p.getProperty(TemplateConfig.TEMPLATE_PATH), p.getProperty(TemplateConfig.SQL_TEMPLATE_NAME), Dto2Map.po2Map(table), path, table.getTableName() + ".sql");
			}
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
