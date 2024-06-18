package com.bookstore.dao;



import java.util.Date;

import com.bookstore.entity.Customer;

public class CustomerDAO extends JpaDAO<Customer> implements GenericDao<Customer> {

	
	
	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
	
		return super.create(customer);
	}

	@Override
	public Customer get(Object id)
	{
		return super.find(Customer.class, id);
		
	}
	
	
	@Override
	public Customer update(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(Customer.class, id);
		
	}
	
	
	
	

}
