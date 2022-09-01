package com.example.database.connector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.Dao.CustomerDao;
import com.example.database.Entity.Customer;
import com.example.database.Entity.custres;
import com.example.database.service.CustomerService;



@RestController
public class Connector {
	
	@Autowired
	public CustomerService customerservice;
	
	
	@GetMapping("/Customer")
	public List<Customer> getCustomer()
	{
		return this.customerservice.getCustomer();
	}
	
	@GetMapping("/CustomerInfo")
	public List<custres> getCustomerinfo()
	{
		return this.customerservice.getCustomerinfo();
	}

	  @PostMapping("/Customer")
	    public Customer addCustomer(@RequestBody Customer customer)
	    {
	    	return this.customerservice.addCustomer(customer);
	    }
	  
	 

}
