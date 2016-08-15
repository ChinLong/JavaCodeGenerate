package cn.com.chinlong.generate.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.chinlong.generate.entity.TableColumnEntity;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.utils.JdbcUtils;

public class MySqlDataBaseUtil {

	/**
	 * 获取指定数据库和用户的所有表名
	 * 
	 * @param conn
	 *            连接数据库对象
	 * @param user
	 *            用户
	 * @param database
	 *            数据库名
	 * @return
	 */
	public static List<String> getAllTableNames() {
		Connection con = JdbcUtils.getConnection();
		List<String> tableNames = new ArrayList<String>();
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		if (con != null) {
			try {
				dbmd = con.getMetaData();
				// 表名列表
				rs = dbmd.getTables(null, null, null, new String[] { "TABLE" });
				// 输出 table_name
				while (rs.next()) {
					tableNames.add(rs.getString("TABLE_NAME"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtils.closeConnection(rs, null, con);
			}
		}
		return tableNames;
	}

	/**
	 * 得到
	 * 
	 * @param tableName
	 * @return
	 */
	@SuppressWarnings("resource")
	public static TableEntity getTableInfo(String tableName) {
		TableEntity tableInfo = new TableEntity();
		List<TableColumnEntity> cols = new ArrayList<TableColumnEntity>();
		TableColumnEntity col = null;
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pstmt = null;
		ResultSetMetaData rsmd = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		// 主键List
		List<String> primaryKeyList = new ArrayList<String>();
		try {
			pstmt = con.prepareStatement("select * from " + tableName);
			rsmd = pstmt.getMetaData();
			dbmd = con.getMetaData();

			// 获得主键
			rs = dbmd.getPrimaryKeys(null, null, tableName);
			while (rs.next()) {
				primaryKeyList.add(rs.getString(4));
			}
			rs = dbmd.getIndexInfo(null, "", tableName, false, true);
			String columnName;
			while (rs.next()) {
				// 非唯一索引
				if(!rs.getBoolean("NON_UNIQUE")){
					
				}
				// 唯一索引
				else{
					// 列名
					columnName = rs.getString("COLUMN_NAME");
					// 非主键
					if(!primaryKeyList.contains(columnName)){
						//TODO
						 String indexName = rs.getString("INDEX_NAME");//索引的名称  
					}
				}
               
                short type = rs.getShort("TYPE");//索引类型  
                short ordinalPosition = rs.getShort("ORDINAL_POSITION");//在索引列顺序号  
                String ascOrDesc = rs.getString("ASC_OR_DESC");//列排序顺序:升序还是降序  
               // System.out.println(nonUnique + "-" + indexQualifier + "-" + indexName + "-" + type + "-" + ordinalPosition + "-" + columnName + "-" + ascOrDesc + "-" + cardinality);     
			}

			tableInfo.setPrimaryKeyList(primaryKeyList);

			for (int i = 1; i < rsmd.getColumnCount() + 1; i++) {
				if (1 == i) {
					// 表名
					tableInfo.setTableName(rsmd.getTableName(1));
				}
				col = new TableColumnEntity();
				col.setColumnName(rsmd.getColumnName(i));
				col.setColumnDataType(rsmd.getColumnTypeName(i));
				if (primaryKeyList.contains(rsmd.getColumnName(i))) {
					col.setPrimaryKey(true);
				} else {
					col.setPrimaryKey(false);
				}
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
