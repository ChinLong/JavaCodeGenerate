package cn.com.chinlong.test;

import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.generate.util.ExcelUtil;
import cn.com.chinlong.utils.Dto2Map;
import cn.com.chinlong.utils.FreeMarkerUtils;

public class UtilTest {

	public static void main(String[] args) throws Exception {
		/*
		 * List<TableEntity> tableList = ExcelUtil.readTableEntity(); for
		 * (TableEntity tableEntity : tableList) {
		 * System.out.println(tableEntity.getTableName()
		 * +"       "+tableEntity.getTableNameDesc()); }
		 */

		/*
		 * TableEntity table = ExcelUtil.readExcelSheet("AF商品情報サイズマスタ"); for(
		 * TableColumnEntity column : table.getColumnList()){
		 * System.out.println(column.toString()); }
		 */
	/*	List<String> list = new ArrayList<String>();
		list.add("AF商品情報マスタ");
		List<ClassBean> classList = Table2Entity.table2Entity(list);
		for (ClassBean classBean : classList) {
			// System.out.println(classBean.getClassName());
			// System.out.println(classBean.getRemarkList());
			// for (ClassColumnBean colum : classBean.getColumnList()) {
			// System.out.println("*************");
			// System.out.println(colum.getColumnName() +
			// colum.getColumnRemark());
			// System.out.println("*************");
			// }
			FreeMarkerUtils.writeTemplete("/template", "entityTemplate.ftl", Dto2Map.po2Map(classBean), "D:/", "dto.java");
		}
		System.out.println("结束");*/
		TableEntity table = ExcelUtil.readExcelSheet("AF商品情報サイズマスタ");
		FreeMarkerUtils.writeTemplete("/template", "sqlTemplate.ftl", Dto2Map.po2Map(table), "D:/", "dto.sql");
		
	}
}
