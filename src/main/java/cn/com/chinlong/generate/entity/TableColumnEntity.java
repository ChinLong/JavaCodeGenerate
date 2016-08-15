package cn.com.chinlong.generate.entity;

public class TableColumnEntity {

	// 是否主键
	private boolean primaryKey;
	// 是否唯一键
	private boolean uniqueKey;
	// 属性名
	private String columnName;
	// 属性名
	private String columnNameDesc;
	// 注释
	private String columnRemark;
	// 类型
	private String columnDataType;
	// 精度
	private Integer precision;
	// 小数级别
	private Integer scale;
	// 是否可为null
	private boolean nullable;
	// 默认值
	private String defaultValue;

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean isUniqueKey() {
		return uniqueKey;
	}

	public void setUniqueKey(boolean uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnNameDesc() {
		return columnNameDesc;
	}

	public void setColumnNameDesc(String columnNameDesc) {
		this.columnNameDesc = columnNameDesc;
	}

	public String getColumnRemark() {
		return columnRemark;
	}

	public void setColumnRemark(String columnRemark) {
		this.columnRemark = columnRemark;
	}

	public String getColumnDataType() {
		return columnDataType;
	}

	public void setColumnDataType(String columnDataType) {
		this.columnDataType = columnDataType;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Override
	public String toString() {
		return "TableColumnEntity [primaryKey=" + primaryKey + ", uniqueKey=" + uniqueKey + ", columnName=" + columnName + ", columnNameDesc=" + columnNameDesc + ", columnRemark=" + columnRemark
				+ ", columnDataType=" + columnDataType + ", precision=" + precision + ", scale=" + scale + ", nullable=" + nullable + ", defaultValue=" + defaultValue + "]";
	}

}
