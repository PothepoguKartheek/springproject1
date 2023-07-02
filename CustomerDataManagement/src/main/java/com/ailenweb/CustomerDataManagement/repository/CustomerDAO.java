package com.ailenweb.CustomerDataManagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ailenweb.CustomerDataManagement.entity.Customer;

@Repository
public class CustomerDAO {
	
	public CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer)
	{
		return repository.save(customer);
	}
	
	
	public Customer updateCustomer(Customer customer)
	{
		return repository.save(customer);
	}
	
	public List<Customer> getAllDetails()
	{
		List<Customer> findAll = repository.findAll();
		return findAll;
	}
	public Customer getCustomerDataById(int id)
	{
		return repository.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
	}
	
	public Customer deleteCustomerDataByid(int id)
	{
		
	}

}
