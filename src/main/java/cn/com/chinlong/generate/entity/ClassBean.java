package cn.com.chinlong.generate.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.com.chinlong.enums.AccessTypes;
import cn.com.chinlong.enums.ClassTypes;

/**
 * 生成DTO基本属性
 * 
 * @author ChinLong
 *
 */
public class ClassBean implements Serializable {
	private static final long serialVersionUID = 1L;
	// 包名
	private String packageValue;
	// import
	private List<String> importList = new ArrayList<>();
	// 注释
	private List<String> remarkList = new ArrayList<String>();
	// 注解
	private List<String> annotationList = new ArrayList<>();
	// 访问级别 默认 public
	private String accessType = AccessTypes.PUBLIC.getAccessType();
	// Class类型
	private String classType = ClassTypes.CLASS.getClassType();
	// 类名s
	private String className;
	// 父类
	private String fatherClassName;
	// 接口
	private List<String> interfaceList = new ArrayList<>();
	// 属性
	private List<ClassColumnBean> columnList = new ArrayList<ClassColumnBean>();
	// 方法
	private List<ClassMethodBean> methodList = new ArrayList<ClassMethodBean>();
	// toString
	private boolean isToString;

	public String getPackageValue() {
		return packageValue;
	}

	public void setPackageValue(String packageValue) {
		this.packageValue = packageValue;
	}

	public List<String> getImportList() {
		return importList;
	}

	public void setImportList(List<String> importList) {
		this.importList = importList;
	}

	public List<String> getAnnotationList() {
		return annotationList;
	}

	public void setAnnotationList(List<String> annotationList) {
		this.annotationList = annotationList;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getFatherClassName() {
		return fatherClassName;
	}

	public void setFatherClassName(String fatherClassName) {
		this.fatherClassName = fatherClassName;
	}

	public List<String> getInterfaceList() {
		return interfaceList;
	}

	public void setInterfaceList(List<String> interfaceList) {
		this.interfaceList = interfaceList;
	}

	public List<ClassColumnBean> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<ClassColumnBean> columnList) {
		this.columnList = columnList;
	}

	public List<ClassMethodBean> getMethodList() {
		return methodList;
	}

	public void setMethodList(List<ClassMethodBean> methodList) {
		this.methodList = methodList;
	}

	public boolean isToString() {
		return isToString;
	}

	public void setToString(boolean isToString) {
		this.isToString = isToString;
	}

	public List<String> getRemarkList() {
		return remarkList;
	}

	public void setRemarkList(List<String> remarkList) {
		this.remarkList = remarkList;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	@Override
	public String toString() {
		return "ClassBean [packageValue=" + packageValue + ", importList=" + importList + ", remarkList=" + remarkList + ", annotationList=" + annotationList + ", accessType=" + accessType
				+ ", classType=" + classType + ", className=" + className + ", fatherClassName=" + fatherClassName + ", interfaceList=" + interfaceList + ", columnList=" + columnList
				+ ", methodList=" + methodList + ", isToString=" + isToString + "]";
	}

}
