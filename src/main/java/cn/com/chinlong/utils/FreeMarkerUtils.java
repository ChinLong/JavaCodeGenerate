package cn.com.chinlong.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import cn.com.chinlong.common.Constant.Encoding;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreeMarkerUtils {

	/**
	 * 
	 * @param templetePath
	 * @param templateName
	 * @param templateEncoding
	 * @param params
	 * @param filePath
	 * @param fileName
	 */
	public static void writeTemplete(String templetePath, String templateName, Map<String, Object> params, String filePath, String fileName) {
		/**
		 * 创建Configuration对象
		 */
		Configuration config = new Configuration();
		/**
		 * 指定模板路径
		 */
		config.setClassForTemplateLoading(FreeMarkerUtils.class, templetePath);
		/**
		 * 设置包装器，并将对象包装为数据模型
		 */
		config.setObjectWrapper(new DefaultObjectWrapper());

		/**
		 * 获取模板,并设置编码方式，这个编码必须要与页面中的编码格式一致
		 */
		FileOutputStream fos = null;
		Writer out = null;
		try {
			Template template = config.getTemplate(templateName, Encoding.UTF8);
			// java文件的生成目录
			fos = new FileOutputStream(new File(filePath, fileName));

			/**
			 * 合并数据模型与模板
			 */
			out = new OutputStreamWriter(fos, Encoding.UTF8);
			template.process(params, out);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		} finally {
			if (null != out) {
				try {
					out.flush();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
