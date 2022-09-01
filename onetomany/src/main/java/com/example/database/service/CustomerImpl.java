package com.example.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.Dao.CustomerDao;
import com.example.database.Entity.Customer;
import com.example.database.Entity.custres;



@Service
public class CustomerImpl implements CustomerService{

	@Autowired
	   private  CustomerDao cust;
	
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return this.cust.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return this.cust.save(customer);
	}

	@Override
	public List<custres> getCustomerinfo() {
		// TODO Auto-generated method stub
		return this.cust.getCustInfo();
	}

	

}
