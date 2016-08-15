package cn.com.chinlong.generate.entity;

import java.util.ArrayList;
import java.util.List;

import cn.com.chinlong.enums.AccessTypes;

/**
 * 生成DTO方法基本属性
 * 
 * @author ChinLong
 *
 */
public class ClassMethodBean {
	// 注释
	private List<String> methodRemarkList = new ArrayList<String>();
	// 注解
	private List<String> methodAnnotationList = new ArrayList<>();
	// 访问级别 默认 private
	private String methodAccessType = AccessTypes.PUBLIC.getAccessType();
	// 返回数据类型
	private String returnDataType;
	// 方法名
	private String methodName;
	// 参数
	private List<ClassParamBean> paramList = new ArrayList<ClassParamBean>();
	// 方法
	private String methodBody;

	public List<String> getMethodRemarkList() {
		return methodRemarkList;
	}

	public void setMethodRemarkList(List<String> methodRemarkList) {
		this.methodRemarkList = methodRemarkList;
	}

	public List<String> getMethodAnnotationList() {
		return methodAnnotationList;
	}

	public void setMethodAnnotationList(List<String> methodAnnotationList) {
		this.methodAnnotationList = methodAnnotationList;
	}

	public String getMethodAccessType() {
		return methodAccessType;
	}

	public void setMethodAccessType(String methodAccessType) {
		this.methodAccessType = methodAccessType;
	}

	public String getReturnDataType() {
		return returnDataType;
	}

	public void setReturnDataType(String returnDataType) {
		this.returnDataType = returnDataType;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public List<ClassParamBean> getParamList() {
		return paramList;
	}

	public void setParamList(List<ClassParamBean> paramList) {
		this.paramList = paramList;
	}

	public String getMethodBody() {
		return methodBody;
	}

	public void setMethodBody(String methodBody) {
		this.methodBody = methodBody;
	}

}
