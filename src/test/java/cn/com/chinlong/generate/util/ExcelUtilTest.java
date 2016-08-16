package cn.com.chinlong.generate.util;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.com.chinlong.generate.entity.TableColumnEntity;
import cn.com.chinlong.generate.entity.TableEntity;

public class ExcelUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReadTableEntity() {
		List<TableEntity> tableList = ExcelUtil.readTableEntity();
		for (TableEntity tableEntity : tableList) {
			System.out.println(tableEntity.getTableName() + "    |    " + tableEntity.getTableNameDesc());
		}
		System.out.println("结束");
	}

	@Test
	public void testReadExcelSheet() {
		TableEntity table = ExcelUtil.readExcelSheet("AF商品情報サイズマスタ");
		for (TableColumnEntity column : table.getColumnList()) {
			System.out.println(column.getColumnName() + "  " + column.getColumnNameDesc() + "  " + column.getColumnDataType() + column.getPrecision() + "  " + column.getScale() + "  "
					+ column.getDefaultValue() + "  " + column.getColumnRemark());
		}
		System.out.println("结束");
	}

}
