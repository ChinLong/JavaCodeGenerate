package cn.com.chinlong.enums;

/**
 * 访问类型枚举
 * 
 * @author ChinLong
 *
 */
public enum AccessTypes {

	PRIVATE("private"), PROTECTED("protected"), DEFAULT(""), PUBLIC("public");

	private final String accessType;

	private AccessTypes(String accessType) {
		this.accessType = accessType;
	}

	public String getAccessType() {
		return accessType;
	}

}
