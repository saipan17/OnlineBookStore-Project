package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Users;

public interface GenericDao<E> {
	
	
	public E create (E t);
	
	
	public E update(E t);
	
	
	public E get(Object id);
	
	
	public void delete(Object id);
	
	
	public List<E> listAll();
	
	
	public long count();
	
	
	
	
	

}
