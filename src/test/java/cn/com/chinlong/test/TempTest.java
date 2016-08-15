package cn.com.chinlong.test;

import java.util.ArrayList;
import java.util.List;

import cn.com.chinlong.generate.entity.ClassColumnBean;
import cn.com.chinlong.generate.entity.ClassBean;
import cn.com.chinlong.generate.entity.ClassMethodBean;
import cn.com.chinlong.generate.entity.ClassParamBean;
import cn.com.chinlong.utils.Dto2Map;
import cn.com.chinlong.utils.FreeMarkerUtils;

public class TempTest {

	public static void main(String[] args) throws Exception {
		ClassBean entity = new ClassBean();
		entity.setClassName("dto");
		entity.setPackageValue("com.zql.dao");
		entity.setFatherClassName("Father");
		entity.setToString(true);
		List<ClassColumnBean> columnList = new ArrayList<ClassColumnBean>();
		for (int i = 0; i < 10; i++) {
			ClassColumnBean ent = new ClassColumnBean();
			ent.setColumnName("name" + i);
			ent.setColumnRemark("this is name" + i);
			ent.setColumnDataType("String");
			ent.setColumnDefaultValue("hello");

			List<String> annotationList = new ArrayList<String>();
			annotationList.add("Table");
			annotationList.add("Colum");
			ent.setColumnAnnotationList(annotationList);

			columnList.add(ent);
		}
		entity.setColumnList(columnList);

		List<String> annotationList = new ArrayList<String>();
		annotationList.add("JavaBean");
		annotationList.add("Controllor");
		entity.setAnnotationList(annotationList);

		List<String> importList = new ArrayList<String>();
		importList.add("java.lang.String");
		importList.add("java.lang.Util");
		entity.setImportList(importList);

		List<String> interfaceList = new ArrayList<String>();
		interfaceList.add("ConeAble");
		interfaceList.add("List");
		entity.setInterfaceList(interfaceList);

		List<String> commentList = new ArrayList<String>();
		commentList.add("这是我生成的javabean");
		commentList.add("@author ChinLong");
		entity.setRemarkList(commentList);

		List<ClassMethodBean> methodList = new ArrayList<ClassMethodBean>();
		for (int i = 0; i < 3; i++) {
			ClassMethodBean method = new ClassMethodBean();
			method.setMethodName("getString");
			method.setReturnDataType("void");
			List<ClassParamBean> paramList = new ArrayList<ClassParamBean>();
			ClassParamBean param = new ClassParamBean();
			param.setParamDataType("String");
			param.setParamName("name");
			paramList.add(param);
			method.setParamList(paramList);
			methodList.add(method);
		}
		entity.setMethodList(methodList);

		FreeMarkerUtils.writeTemplete("/template", "entityTemplate.ftl", Dto2Map.po2Map(entity), "D:/", "dto.java");
		System.out.println("wancheng");
	}
}
