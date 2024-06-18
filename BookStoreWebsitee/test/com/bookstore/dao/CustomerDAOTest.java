package com.bookstore.dao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.bookstore.dao.CustomerDAO;

import com.bookstore.entity.Customer;

public class CustomerDAOTest {

	private static CustomerDAO customerDAO;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		customerDAO = new CustomerDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		customerDAO.close();
	}

	
	
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setEmail("tom@gmail.com");
		customer.setPassword("lala");
		customer.setFullName("Tom Eager");
		customer.setCity("NewYork");
		customer.setCountry("United States");
		customer.setAddress("100 North Avenue");
		customer.setPassword("secret");
		customer.setPhone("18001900");
		customer.setZipcode("100000");
		
		Customer savedCustomer = customerDAO.create(customer);
		assertTrue(savedCustomer.getCustomerId() > 0);
		
		
	}

	@Test
	public void testGetObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteObject() {
		fail("Not yet implemented");
	}

}
