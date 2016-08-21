package cn.com.chinlong.generate.service;

import cn.com.chinlong.common.Constant.DbType;
import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.generate.util.IDataBaseUtil;
import cn.com.chinlong.generate.util.MySqlDataBaseUtil;
import cn.com.chinlong.generate.util.OracleDataBaseUtil;
import cn.com.chinlong.utils.PropertyUtils;

public class DataBaseUtilFactory {

	private IDataBaseUtil dataBaseUtil = null;

	public IDataBaseUtil getDataBaseUtil() {
		switch (PropertyUtils.getValueFromPropertyByname(Resource.TEMPLETE_FILENAME, DbType.DB_TYPE).toLowerCase()) {
		case DbType.MYSQL:
			dataBaseUtil = new MySqlDataBaseUtil();
			break;
//		case DbType.MARIADB:
//			dataBaseUtil = new MySqlDataBaseUtil();
//			break;
		case DbType.ORACLE:
			dataBaseUtil = new OracleDataBaseUtil();
			break;
		default:
			dataBaseUtil = new MySqlDataBaseUtil();
			break;
		}
		return dataBaseUtil;
	}
}
