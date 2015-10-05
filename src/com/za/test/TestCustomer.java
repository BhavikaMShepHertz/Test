package com.za.test;

import com.za.code.Customer;

import junit.framework.TestCase;
public class TestCustomer extends TestCase {
	
	public void testgetcname()
	{
		Customer c1=new Customer();
		c1.setfname("Bhavika");
		c1.setlname("Mehta");
		assertEquals("Bhavika Mehta", c1.getcname());
	
		Customer c2=new Customer();
		c2.setfname(null);
		c2.setlname(null);
		assertEquals("N/AN/A", c2.getcname());
		
		Customer c3=new Customer();
		c3.setfname("Bhavika");
		c3.setlname(null);
		assertEquals("BhavikaN/A", c3.getcname());
	
	}
}

	
