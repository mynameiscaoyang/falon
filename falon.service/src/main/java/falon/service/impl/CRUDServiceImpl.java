package falon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import falon.dao.CURDMapper;
import falon.service.CURDService;

public class CRUDServiceImpl<T, D  extends CURDMapper> implements CURDService<T>{
	
	@Autowired
	private D dao;

	public int insert(T t) {
		return dao.insert(t);
	}

	public int delete(int primaryKey) {
		return dao.delete(primaryKey);
	}

	public T find(T t) {
		// TODO Auto-generated method stub
		return (T) dao.find(t);
	}

	public List<T> findByCondition(T t) {
		return dao.findByCondition(t);
	}

}
