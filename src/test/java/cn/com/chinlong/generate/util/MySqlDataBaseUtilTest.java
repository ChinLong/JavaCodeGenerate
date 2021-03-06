package cn.com.chinlong.generate.util;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.com.chinlong.generate.entity.TableColumnEntity;
import cn.com.chinlong.generate.entity.TableEntity;

public class MySqlDataBaseUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAllTableNames() {
		IDataBaseUtil dataBaseUtil = new MySqlDataBaseUtil();
		List<TableEntity> tableList = dataBaseUtil.getAllTableNames();
		for (TableEntity table : tableList) {
			System.out.println(table.getTableName() + "  |  " + table.getTableNameDesc());
		}
	}

	@Test
	public void testGetTableInfo() {
		IDataBaseUtil dataBaseUtil = new MySqlDataBaseUtil();
		TableEntity table = dataBaseUtil.getTableInfo("af_product_size");
		System.out.println(table.getTableName() + "    " + table.getTableNameDesc());
		System.out.println(table.getPrimaryKeyList());
		for (TableColumnEntity column : table.getColumnList()) {
			System.out.println(column);
		}
	}
}
