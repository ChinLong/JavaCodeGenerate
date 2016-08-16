package cn.com.chinlong.generate.util;

import java.io.File;
import java.util.Properties;

import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.common.Constant.Sign;
import cn.com.chinlong.common.Constant.TemplateConfig;
import cn.com.chinlong.generate.entity.ClassBean;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.utils.Dto2Map;
import cn.com.chinlong.utils.FileUtils;
import cn.com.chinlong.utils.FreeMarkerUtils;
import cn.com.chinlong.utils.PropertyUtils;
import cn.com.chinlong.utils.StringUtils;

public class GenerateUtil {

	public boolean dtoGenerate(String sheetName) {
		boolean result = true;
		try {
			Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
			ClassBean classBean = Table2Entity.table2Entity(ExcelUtil.readExcelSheet(sheetName));
			String path = p.getProperty(TemplateConfig.ENTITY_TEMPLATE_NAME);
			if (StringUtils.isEmpty(path)) {
				path = File.separator;
			}
			path = path + classBean.getPackageValue().replace(Sign.POINT, File.separator);
			FileUtils.mkDir(new File(path));
			FreeMarkerUtils.writeTemplete(p.getProperty(TemplateConfig.TEMPLATE_PATH), p.getProperty(TemplateConfig.ENTITY_TEMPLATE_NAME), Dto2Map.po2Map(classBean), path, classBean.getClassName() + ".java");
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	public boolean sqlGenerate(String sheetName) {
		boolean result = true;
		try {
			Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
			TableEntity table = ExcelUtil.readExcelSheet(sheetName);
			FreeMarkerUtils.writeTemplete(p.getProperty(TemplateConfig.TEMPLATE_PATH), p.getProperty(TemplateConfig.SQL_TEMPLATE_NAME), Dto2Map.po2Map(table), p.getProperty(TemplateConfig.SQL_PATH), table.getTableName() + ".sql");
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
}
