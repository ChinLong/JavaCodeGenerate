package cn.com.chinlong.generate.util;

import org.junit.Before;
import org.junit.Test;

import cn.com.chinlong.generate.entity.ClassBean;
import cn.com.chinlong.generate.entity.ClassColumnBean;

public class Table2EntityTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTable2Entity() {
		ClassBean classBean = Table2Entity.table2Entity(ExcelUtil.readExcelSheet("AF商品情報マスタ"));
		System.out.println(classBean.getClassName());
		System.out.println(classBean.getRemarkList());
		for (ClassColumnBean colum : classBean.getColumnList()) {
			System.out.println(colum.getColumnName() + "  |  " + colum.getColumnRemark());
		}
		System.out.println("结束");
	}

}
