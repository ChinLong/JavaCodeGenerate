package cn.com.chinlong.generate.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.chinlong.generate.entity.TableColumnEntity;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.utils.JdbcUtils;

public class MySqlDataBaseUtil implements IDataBaseUtil {

	/**
	 * 获取指定数据库和用户的所有表名
	 * 
	 * @return
	 */
	public List<TableEntity> getAllTableNames() {
		Connection con = JdbcUtils.getConnection();
		List<TableEntity> tableList = new ArrayList<TableEntity>();
		TableEntity table = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		if (con != null) {
			try {
				dbmd = con.getMetaData();
				// 表名列表
				rs = dbmd.getTables(null, null, "%", new String[] { "TABLE" });
				// 输出 table_name
				while (rs.next()) {
					table = new TableEntity();
					table.setTableName(rs.getString("TABLE_NAME"));
					table.setTableNameDesc(rs.getString("REMARKS"));
					tableList.add(table);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtils.closeConnection(rs, null, con);
			}
		}
		if (null == tableList) {
			tableList = new ArrayList<TableEntity>();
		}
		return tableList;
	}

	/**
	 * 得到
	 * 
	 * @param tableName
	 * @return
	 */
	public TableEntity getTableInfo(String tableName) {
		TableEntity tableInfo = new TableEntity();
		List<TableColumnEntity> cols = new ArrayList<TableColumnEntity>();
		TableColumnEntity col = null;
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pstmt = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;

		try {
			pstmt = con.prepareStatement("select * from " + tableName + " where 1 = 2");
			dbmd = con.getMetaData();
			// 表名
			tableInfo.setTableName(tableName.toLowerCase());
			List<TableEntity> tableList = getAllTableNames();
			for (TableEntity tableEntity : tableList) {
				if (tableName.equalsIgnoreCase(tableEntity.getTableName())) {
					tableInfo.setTableNameDesc(tableEntity.getTableNameDesc());
					break;
				}
			}
			// 获得主键
			List<String> primaryKeyList = new ArrayList<String>();
			rs = dbmd.getPrimaryKeys(null, null, tableName);
			while (rs.next()) {
				primaryKeyList.add(rs.getString("COLUMN_NAME"));
			}
			tableInfo.setPrimaryKeyList(primaryKeyList);
			ResultSet rst = con.getMetaData().getColumns(null, null, tableName, "%");
			while (rst.next()) {
				col = new TableColumnEntity();
				col.setColumnName(rst.getString("COLUMN_NAME"));// 列名
				col.setColumnNameDesc(rst.getString("REMARKS"));
				col.setColumnDataType(rst.getString("TYPE_NAME"));
				col.setNullable(1 == rst.getInt("NULLABLE"));
				col.setDefaultValue(rst.getString("COLUMN_DEF"));
				col.setPrecision(rst.getInt("COLUMN_SIZE"));
				col.setScale(rst.getInt("DECIMAL_DIGITS"));
				cols.add(col);
			}
			tableInfo.setColumnList(cols);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.closeConnection(rs, pstmt, con);
		}
		return tableInfo;
	}
}
