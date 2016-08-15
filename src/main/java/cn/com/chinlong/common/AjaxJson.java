package cn.com.chinlong.common;

import java.io.Serializable;
import java.util.Map;

public class AjaxJson implements Serializable {
	private static final long serialVersionUID = 1L;

	private boolean success = true;// 是否成功
	private String msg = "";// 提示信息
	private String flag = "";// 返回标识
	private Object obj = null;// 其他信息
	private Map<String, Object> attributes;// 其他参数

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
