package com.example.database.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.database.Entity.Customer;
import com.example.database.Entity.custres;


public interface CustomerDao extends JpaRepository<Customer,Long>{
	
//	@Query("SELECT c from customerdt c join c.orders c1")
	@Query("SELECT new com.example.database.Entity.custres(c.name,c.ph,c1.ordername,c1.price) from customerdt c join c.orders c1")
	public List<custres> getCustInfo();

}
