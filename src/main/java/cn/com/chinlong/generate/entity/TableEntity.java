package cn.com.chinlong.generate.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TableEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	// 表名
	private String tableName;
	// 表名
	private String tableNameDesc;
	// 属性
	private List<TableColumnEntity> columnList = new ArrayList<TableColumnEntity>();
	// 主键
	private List<String> primaryKeyList = new ArrayList<String>();

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableNameDesc() {
		return tableNameDesc;
	}

	public void setTableNameDesc(String tableNameDesc) {
		this.tableNameDesc = tableNameDesc;
	}

	public List<TableColumnEntity> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<TableColumnEntity> columnList) {
		this.columnList = columnList;
	}

	public List<String> getPrimaryKeyList() {
		return primaryKeyList;
	}

	public void setPrimaryKeyList(List<String> primaryKeyList) {
		this.primaryKeyList = primaryKeyList;
	}

	@Override
	public String toString() {
		return "TableEntity [tableName=" + tableName + ", tableNameDesc=" + tableNameDesc + ", columnList=" + columnList + ", primaryKeyList=" + primaryKeyList + "]";
	}

}
