package cn.com.chinlong.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ChinLong
 *
 */
public class Dto2Map {

	/**
	 * javabean to map
	 * 
	 * @param o
	 * @return
	 * @throws Exception
	 */
	public static Map<String, Object> po2Map(Object o) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = null;
		fields = o.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			String proName = field.getName();
			Object proValue = field.get(o);
			map.put(proName, proValue);
		}
		return map;
	}

	/**
	 * map to javabean
	 * 
	 * @param map
	 * @param o
	 * @return
	 * @throws Exception
	 */
	public static Object map2Po(Map<String, Object> map, Object o) throws Exception {
		if (!map.isEmpty()) {
			for (String k : map.keySet()) {
				Object v = "";
				if (!k.isEmpty()) {
					v = map.get(k);
				}
				Field[] fields = null;
				fields = o.getClass().getDeclaredFields();
				for (Field field : fields) {
					int mod = field.getModifiers();
					if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
						continue;
					}
					if (field.getName().toUpperCase().equals(k)) {
						field.setAccessible(true);
						field.set(o, v);
					}
				}
			}
		}
		return o;
	}
}
