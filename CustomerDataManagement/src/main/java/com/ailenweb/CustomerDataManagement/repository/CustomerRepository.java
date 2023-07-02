package com.ailenweb.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ailenweb.CustomerDataManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
