package com.example.database.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.Entity.Orders;

public interface OrderDao extends JpaRepository<Orders,Long> {

}
