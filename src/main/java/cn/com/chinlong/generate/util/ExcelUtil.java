package cn.com.chinlong.generate.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import cn.com.chinlong.common.Constant.ExcelConfig;
import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.common.Constant.Sign;
import cn.com.chinlong.generate.entity.TableColumnEntity;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.utils.PropertyUtils;
import cn.com.chinlong.utils.StringUtils;

public class ExcelUtil {

	/**
	 * 读取汇总
	 * 
	 * @param sheetNum
	 * @return
	 */
	public static List<TableEntity> readTableEntity() {
		// 读取配置
		Properties p = PropertyUtils.getProperty(Resource.EXCEL_FILENAME);
		// 汇总页
		int sheetNum = Integer.parseInt(p.getProperty(ExcelConfig.TABLE_SHEET));
		// 读取开始行数
		int startRow = Integer.parseInt(p.getProperty(ExcelConfig.TABLE_START_ROW));
		// 表名列
		int tableNameCel = Integer.parseInt(p.getProperty(ExcelConfig.TABLE_NAME_CEL));
		// 表名列
		int tableNameDescCel = Integer.parseInt(p.getProperty(ExcelConfig.TABLE_NAME_DESC_CEL));
		;
		List<TableEntity> tables = new ArrayList<TableEntity>();
		try {
			Workbook wb = WorkbookFactory.create(new File(p.getProperty(ExcelConfig.EXCEL_PATH)));
			Sheet sheet = wb.getSheetAt(sheetNum);
			Row row = null;
			TableEntity table = null;
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				if (i < startRow) {
					continue;
				}
				table = new TableEntity();
				row = sheet.getRow(i);
				table.setTableName(row.getCell(tableNameCel).getStringCellValue());
				table.setTableNameDesc(row.getCell(tableNameDescCel).getStringCellValue());
				if (StringUtils.isNotEmpty(table.getTableName())) {
					tables.add(table);
				}
			}
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tables;
	}

	/**
	 * 读取表
	 * 
	 * @param sheetName
	 * @return
	 */
	public static TableEntity readExcelSheet(String sheetName) {

		TableEntity table = new TableEntity();

		// 读取配置
		Properties p = PropertyUtils.getProperty(Resource.EXCEL_FILENAME);
		// 表名
		String tableNamePosition = p.getProperty(ExcelConfig.TABLE_NAME_POSITION);
		// 表名描述
		String tableNameDescPosition = p.getProperty(ExcelConfig.TABLE_NAME_DESC_POSITION);
		// 表示勾选
		String columnSelectedStr = p.getProperty(ExcelConfig.COLUMN_SELECTED_STR);
		// 表示没勾选
		String columnUnselectedStr = p.getProperty(ExcelConfig.COLUMN_UNSELECTED_STR);
		// 读取开始行数
		int start_row = Integer.parseInt(p.getProperty(ExcelConfig.START_ROW));
		// 属性名列
		int columnNameCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_NAME_CEL));
		// 属性名desc
		int columnNameDescCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_NAME_DESC_CEL));
		// 属性备注列
		int columnRemarkCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_REMARK_CEL));
		// 数据类型是否已包含长度单位[true:int(11);false:int]
		boolean columnDatatypeWithLength = Boolean.parseBoolean(p.getProperty(ExcelConfig.COLUMN_DATATYPE_WITH_LENGTH));
		// 数据类型列
		int columnDatatypeCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_DATATYPE_CEL));
		// 总精度列
		int columnPrecisionCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_PRECISION_CEL));
		// 小数精度列
		int columnScaleCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_SCALE_CEL));
		// 字符数列
		int columnTypeLengthCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_TYPE_LENGTH_CEL));
		// 主键列
		int columnPrimaryKeyCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_PRIMARY_KEY_CEL));
		// 唯一键列
		int columnUniqueKeyCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_UNIQUE_KEY_CEL));
		// 是否可为null列
		int columnNotNullCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_NOT_NULL_CEL));
		// 默认值
		int columnDefaultValueCel = Integer.parseInt(p.getProperty(ExcelConfig.COLUMN_DEFAULT_VALUE_CEL));

		try {
			Workbook wb = WorkbookFactory.create(new File(p.getProperty(ExcelConfig.EXCEL_PATH)));
			Sheet sheet = wb.getSheet(sheetName);

			String[] tableNamePositionArray = tableNamePosition.split(Sign.COMMA);
			String[] tableNameDescPositionArray = tableNameDescPosition.split(Sign.COMMA);
			String tableName = sheet.getRow(Integer.parseInt(tableNamePositionArray[0])).getCell(Integer.parseInt(tableNamePositionArray[1])).getStringCellValue();
			String tableNameDesc = sheet.getRow(Integer.parseInt(tableNameDescPositionArray[0])).getCell(Integer.parseInt(tableNameDescPositionArray[1])).getStringCellValue();
			// 表名
			if (StringUtils.isEmpty(tableName)) {
				tableName = sheet.getSheetName();
			}
			table.setTableName(tableName);
			table.setTableNameDesc(tableNameDesc);

			List<TableColumnEntity> columnList = new ArrayList<TableColumnEntity>();
			TableColumnEntity column = null;

			Row row = null;
			Cell cell = null;
			String tempItem;
			int index1, index2, index3;

			for (int j = start_row; j <= sheet.getLastRowNum(); j++) {
				row = sheet.getRow(j);
				if (null == row) {
					continue;
				}
				column = new TableColumnEntity();
				// 属性名
				cell = row.getCell(columnNameCel);
				tempItem = cell.getStringCellValue();
				if (StringUtils.isEmpty(tempItem)) {
					continue;
				} else {
					tempItem = StringUtils.safeTrim(tempItem);
				}
				column.setColumnName(tempItem);
				// 属性名称
				cell = row.getCell(columnNameDescCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = StringUtils.safeTrim(cell.getStringCellValue());
				column.setColumnNameDesc(tempItem);
				// 备注
				cell = row.getCell(columnRemarkCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = StringUtils.safeTrim(cell.getStringCellValue());
				column.setColumnRemark(tempItem);
				// 数据类型
				cell = row.getCell(columnDatatypeCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = StringUtils.safeTrim(cell.getStringCellValue());
				// 如果数据类型包含长度
				if (columnDatatypeWithLength) {
					index1 = tempItem.indexOf(Sign.LEFT_PARENTHESES);
					if (index1 > 0) {
						column.setColumnDataType(StringUtils.safeTrim(tempItem.substring(0, index1)));
						index2 = tempItem.indexOf(Sign.COMMA);
						index3 = tempItem.indexOf(Sign.RIGHT_PARENTHESES);
						if (index3 > 0) {
							column.setPrecision(Integer.valueOf(StringUtils.safeTrim(tempItem.substring(index1, index2))));
							column.setScale(Integer.valueOf(StringUtils.safeTrim(tempItem.substring(index2, index3))));
						} else {
							column.setPrecision(Integer.valueOf(StringUtils.safeTrim(tempItem.substring(index1, index3))));
						}
					} else {
						column.setColumnDataType(tempItem);
					}
				} else {
					// 数据类型
					column.setColumnDataType(tempItem);
					// 数据精确度
					cell = row.getCell(columnPrecisionCel);
					if (null != cell) {
						cell.setCellType(Cell.CELL_TYPE_STRING);
					}
					tempItem = StringUtils.safeTrim(cell.getStringCellValue());
					// 含小数时
					if (StringUtils.isNotEmpty(tempItem) && !tempItem.equalsIgnoreCase(columnUnselectedStr)) {
						column.setPrecision(Integer.valueOf(tempItem));
						cell = row.getCell(columnScaleCel);
						if (null != cell) {
							cell.setCellType(Cell.CELL_TYPE_STRING);
						}
						tempItem = StringUtils.safeTrim(cell.getStringCellValue());
						if (StringUtils.isNotEmpty(tempItem) && !tempItem.equalsIgnoreCase(columnUnselectedStr)) {
							column.setScale(Integer.valueOf(tempItem));
						}
					}
					// 不是小数时
					else {
						cell = row.getCell(columnTypeLengthCel);
						if (null != cell) {
							cell.setCellType(Cell.CELL_TYPE_STRING);
						}
						tempItem = StringUtils.safeTrim(cell.getStringCellValue());
						if (StringUtils.isNotEmpty(tempItem) && !tempItem.equalsIgnoreCase(columnUnselectedStr)) {
							column.setPrecision(Integer.valueOf(tempItem));
						}
					}
				}
				// 主键
				cell = row.getCell(columnPrimaryKeyCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = StringUtils.safeTrim(cell.getStringCellValue());
				if (StringUtils.isNotEmpty(tempItem) && tempItem.equalsIgnoreCase(columnSelectedStr)) {
					column.setPrimaryKey(true);
				}
				// 唯一键
				cell = row.getCell(columnUniqueKeyCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = StringUtils.safeTrim(cell.getStringCellValue());
				if (StringUtils.isNotEmpty(tempItem) && tempItem.equalsIgnoreCase(columnSelectedStr)) {
					column.setUniqueKey(true);
				}
				// 可为null
				cell = row.getCell(columnNotNullCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = StringUtils.safeTrim(cell.getStringCellValue());
				column.setNullable(true);
				if (StringUtils.isNotEmpty(tempItem) && tempItem.equalsIgnoreCase(columnSelectedStr)) {
					column.setNullable(false);
				}
				// 默认值
				cell = row.getCell(columnDefaultValueCel);
				if (null != cell) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
				}
				tempItem = cell.getStringCellValue();
				if (StringUtils.isNotEmpty(tempItem)) {
					column.setDefaultValue(tempItem);
				}
				columnList.add(column);
			}
			table.setColumnList(columnList);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return table;
	}

	@SuppressWarnings("unused")
	private static final String getCellToString(Cell cell) {
		String result = null;
		if (null != cell) {
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC: // 数字
				result = String.valueOf(cell.getNumericCellValue());
				break;
			case HSSFCell.CELL_TYPE_STRING: // 字符串
				result = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
				result = String.valueOf(cell.getBooleanCellValue());
				break;
			case HSSFCell.CELL_TYPE_FORMULA: // 公式
				result = String.valueOf(cell.getCellFormula());
				break;
			case HSSFCell.CELL_TYPE_BLANK: // 空值
			case HSSFCell.CELL_TYPE_ERROR: // 故障
			default:
				result = "";
				break;
			}
		}
		return result;
	}
}
