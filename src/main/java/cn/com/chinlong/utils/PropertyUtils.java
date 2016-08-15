package cn.com.chinlong.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.chinlong.common.Constant.Encoding;

/**
 * Property工具类
 * 
 * @author ChinLong
 *
 */
public class PropertyUtils {
	// LOG
	private static Log logger = LogFactory.getLog(PropertyUtils.class);

	/**
	 * 读取文件的所有属性
	 * 
	 * @param name
	 * @return
	 */
	public static Properties getProperty(String name) {
		Properties props = new Properties();
		InputStream in = PropertyUtils.class.getClassLoader().getResourceAsStream(name);
		if (in == null) {
			in = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
		}
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(in, Encoding.UTF8));
			props.load(bf);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(" Get Property Error By " + name, e);
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				in = null;
			}
		}
		return props;
	}

	/**
	 * 根据Key 读取Value
	 * 
	 * @param name
	 * @param key
	 * @return
	 */
	public static String getValueFromPropertyByname(String name, String key) {
		String value = null;
		try {
			Properties props = getProperty(name);
			if (null != props) {
				value = props.getProperty(key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
