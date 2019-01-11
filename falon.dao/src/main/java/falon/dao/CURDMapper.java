package falon.dao;

import java.util.List;

/**
 * 增删查改的base
 * @author 曹洋 
 *
 */
public interface CURDMapper<T> {
	
	/**
	 * 插入数据
	 * @param t
	 * @return
	 */
	int insert(T t);
	
	/**
	 * 删除数据
	 * @param primaryKey
	 * @return
	 */
	int delete(int primaryKey);
	
	/**
	 * 查找单个数据
	 * @param t
	 * @return
	 */
	T find(T t);
	
	/**
	 *	 根据条件查找数据
	 * @param t
	 * @return
	 */
	List<T> findByCondition(T t);
}
