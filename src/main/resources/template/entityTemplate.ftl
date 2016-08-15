package ${packageValue};

<#list importList as item>
import ${item};
</#list>
<#if remarkList?size gt 0>
/**
<#list remarkList as item>
 * ${item}
</#list>
 */
</#if>
<#list annotationList as item>
@${item}
</#list>
${accessType} ${classType} ${className}<#if fatherClassName??> extends ${fatherClassName}</#if><#if interfaceList?size gt 0> implements <#list interfaceList as item>${item}<#if ((item_index + 1) != interfaceList?size)>,</#if></#list></#if> {
	<#list columnList as column>
	/** ${column.columnRemark!""} */
	private ${column.columnDataType} ${column.columnName} <#if column.defaultValue??> = ${column.defaultValue}</#if>;
	</#list>
	
	<#list columnList as column>
	/**
	 *方法: 取得${column.columnName}
	 *@return: ${column.columnName}  ${column.columnRemark!""}
	 */
	
	public ${column.columnDataType} get${column.columnName?cap_first}(){
		return this.${column.columnName};
	}

	/**
	 *方法: 设置${column.columnName}
	 *@param: ${column.columnName}  ${column.columnRemark!""}
	 */
	public void set${column.columnName?cap_first}(${column.columnDataType} ${column.columnName}){
		this.${column.columnName} = ${column.columnName};
	}
	</#list>
	
	<#if isToString>
	@Override
	public String toString() {
		return "${className} [ <#list columnList as column><#if 0 == column_index>${column.columnName}=" + ${column.columnName} + <#else>", ${column.columnName}=" + ${column.columnName} + </#if></#list> "]";
	}
	</#if>
}
