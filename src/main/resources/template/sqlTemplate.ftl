-- ${tableName}
-- ${tableNameDesc}
CREATE TABLE IF NOT EXISTS `${tableName}` (
  <#list columnList as column>
  `${column.columnName}` ${column.columnDataType}<#if column.precision??>(${column.precision}<#if column.scale??>,${column.scale}</#if>)</#if><#if !column.nullable> NOT NULL</#if><#if column.defaultValue??> DEFAULT '${column.defaultValue}'</#if><#if column.columnNameDesc??> COMMENT '${column.columnNameDesc}'</#if><#if (column_index+1) != columnList?size>,</#if>
  </#list>
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci <#if tableNameDesc??>COMMENT='${tableNameDesc}'</#if>;