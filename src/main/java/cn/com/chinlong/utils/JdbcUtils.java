package cn.com.chinlong.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.common.Constant.TemplateConfig;

public final class JdbcUtils {
	// LOG
	private static Log logger = LogFactory.getLog(JdbcUtils.class);

	private static String url;
	private static String username;
	private static String password;
	private static Connection con = null;

	// 单例
	private static JdbcUtils instance = null;

	/**
	 * 私有构造
	 */
	private JdbcUtils() {
	}

	/**
	 * 默认构造
	 * 
	 * @return
	 */
	public static JdbcUtils getInstance() {
		if (instance == null) {
			synchronized (JdbcUtils.class) {
				if (instance == null) {
					instance = new JdbcUtils();
				}
			}
		}
		return instance;
	}

	static {
		Properties p = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
		url = p.getProperty(TemplateConfig.DB_URL);
		username = p.getProperty(TemplateConfig.DB_USERNAME);
		password = p.getProperty(TemplateConfig.DB_PASSWORD);
		try {
			Class.forName(p.getProperty(TemplateConfig.DB_DRIVER));
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	/**
	 * 得到连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error(" Get DB Connection Error : ", e);
		}
		return con;
	}

	/**
	 * 关闭连接
	 * 
	 * @param rs
	 * @param st
	 * @param con
	 */
	public static void closeConnection(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (con != null)
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
	}
}
