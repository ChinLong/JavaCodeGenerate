package cn.com.chinlong.generate.entity;

import java.util.ArrayList;
import java.util.List;

import cn.com.chinlong.enums.AccessTypes;

/**
 * DTO类属性
 * 
 * @author ChinLong
 *
 */
public class ClassColumnBean {
	// 注释
	private String columnRemark;
	// 注解
	private List<String> columnAnnotationList = new ArrayList<>();
	// 访问级别 默认 private
	private String columnAccessType = AccessTypes.PRIVATE.getAccessType();
	// 数据类型
	private String columnDataType;
	// 属性名
	private String columnName;
	// 默认值
	private String columnDefaultValue;

	public String getColumnRemark() {
		return columnRemark;
	}

	public void setColumnRemark(String columnRemark) {
		this.columnRemark = columnRemark;
	}

	public List<String> getColumnAnnotationList() {
		return columnAnnotationList;
	}

	public void setColumnAnnotationList(List<String> columnAnnotationList) {
		this.columnAnnotationList = columnAnnotationList;
	}

	public String getColumnAccessType() {
		return columnAccessType;
	}

	public void setColumnAccessType(String columnAccessType) {
		this.columnAccessType = columnAccessType;
	}

	public String getColumnDataType() {
		return columnDataType;
	}

	public void setColumnDataType(String columnDataType) {
		this.columnDataType = columnDataType;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnDefaultValue() {
		return columnDefaultValue;
	}

	public void setColumnDefaultValue(String columnDefaultValue) {
		this.columnDefaultValue = columnDefaultValue;
	}

	@Override
	public String toString() {
		return "DtoColumnEntity [columnRemark=" + columnRemark + ", columnAnnotationList=" + columnAnnotationList + ", columnAccessType=" + columnAccessType + ", columnDataType=" + columnDataType
				+ ", columnName=" + columnName + ", columnDefaultValue=" + columnDefaultValue + "]";
	}

}
