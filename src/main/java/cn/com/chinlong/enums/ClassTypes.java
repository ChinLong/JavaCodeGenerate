package cn.com.chinlong.enums;

/**
 * 类类型
 * 
 * @author ChinLong
 *
 */
public enum ClassTypes {

	CLASS("class"), INTERFASE("interfase"),ENUM("enum");
	private final String classType;

	private ClassTypes(String classType) {
		this.classType = classType;
	}

	public String getClassType() {
		return classType;
	}
}
