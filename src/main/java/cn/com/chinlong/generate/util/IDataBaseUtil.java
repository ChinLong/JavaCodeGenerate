package cn.com.chinlong.generate.util;

import java.util.List;

import cn.com.chinlong.generate.entity.TableEntity;

public interface IDataBaseUtil {
	/**
	 * 查询所有的表名
	 * 
	 * @return
	 */
	public List<TableEntity> getAllTableNames();

	/**
	 * 根据表名查询表信息
	 * 
	 * @param tableName
	 * @return
	 */
	public TableEntity getTableInfo(String tableName);
}
