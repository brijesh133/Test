package com.example.database.service;

import java.util.List;

import com.example.database.Entity.Customer;
import com.example.database.Entity.custres;




public interface CustomerService {
	public List<Customer> getCustomer();
	public Customer addCustomer(Customer customer);
	public List<custres> getCustomerinfo();
	
}
