package cn.com.chinlong.common;

public class Constant {

	public final static class Encoding {
		public static final String UTF8 = "UTF-8";
	}

	public final static class Sign {
		// 左括号
		public static final String LEFT_PARENTHESES = "(";
		// 右括号
		public static final String RIGHT_PARENTHESES = ")";
		// 逗号
		public static final String COMMA = ",";
		// 点号
		public static final String POINT = ".";
		// 下划线
		public static final String UNDERSCORE = "_";
	}

	public final static class Resource {
		// 数据库连接资源文件名
		public static final String TEMPLETE_FILENAME = "templete_config.properties";
		// 连接Excel配置文件
		public static final String EXCEL_FILENAME = "excel_config.properties";
	}

	public final static class TemplateConfig {
		public static final String DB_URL = "db.url";
		public static final String DB_USERNAME = "db.username";
		public static final String DB_PASSWORD = "db.password";
		public static final String DB_DRIVER = "db.driver";
		public static final String ENTITY_PACKAGE = "entity_package";
		public static final String SQL_PATH = "sql_path";
		public static final String PROJECT_PATH = "project_path";
		public static final String UNDERSCORE_TO_CAMEL_CASE = "underscore_to_camel_case";
		public static final String TEMPLATE_PATH = "template_path";
		public static final String SQL_TEMPLATE_NAME = "sql_template_name";
		public static final String ENTITY_TEMPLATE_NAME = "entity_template_name";
	}

	public final static class ExcelConfig {
		public static final String EXCEL_PATH = "excel_path"; // excel文件路径

		public static final String TABLE_SHEET = "table_sheet"; // Excel汇总表页面
		public static final String TABLE_START_ROW = "table_start_row"; // 开始行数
		public static final String TABLE_NAME_CEL = "table_name_cel"; // 表名
		public static final String TABLE_NAME_DESC_CEL = "table_name_desc_cel"; // 表名

		public static final String TABLE_NAME_POSITION = "table_name_position"; // 表名
		public static final String TABLE_NAME_DESC_POSITION = "table_name_desc_position"; // 表名
		// public static final String START_SHEET = "start_sheet"; // 从第几sheet开始
		public static final String START_ROW = "start_row"; // 从第几行开始
		public static final String COLUMN_SELECTED_STR = "column_selected_str"; // 表示勾选
		public static final String COLUMN_UNSELECTED_STR = "column_unselected_str"; // 表示没勾选
		public static final String COLUMN_NAME_CEL = "column_name_cel"; // 属性名列
		public static final String COLUMN_NAME_DESC_CEL = "column_name_desc_cel"; // 属性名desc
		public static final String COLUMN_REMARK_CEL = "column_remark_cel"; // 属性备注列
		public static final String COLUMN_DATATYPE_WITH_LENGTH = "column_datatype_with_length"; // 数据类型是否已包含长度单位[true:int(11);false:int]
		public static final String COLUMN_DATATYPE_CEL = "column_datatype_cel"; // 数据类型列
		public static final String COLUMN_TYPE_LENGTH_CEL = "column_type_length_cel"; // 字符数列
		public static final String COLUMN_PRECISION_CEL = "column_precision_cel"; // 总精度列
		public static final String COLUMN_SCALE_CEL = "column_scale_cel"; // 小数精度列
		public static final String COLUMN_PRIMARY_KEY_CEL = "column_primary_key_cel"; // 主键列
		public static final String COLUMN_UNIQUE_KEY_CEL = "column_unique_key_cel"; // 唯一键列
		public static final String COLUMN_NOT_NULL_CEL = "column_not_null_cel"; // 是否可为null
		public static final String COLUMN_DEFAULT_VALUE_CEL = "column_default_value_cel"; // 默认值
	}
}
