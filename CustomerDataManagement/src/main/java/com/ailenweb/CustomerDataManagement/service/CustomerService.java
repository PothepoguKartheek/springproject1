package com.ailenweb.CustomerDataManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ailenweb.CustomerDataManagement.entity.Customer;
import com.ailenweb.CustomerDataManagement.repository.CustomerDAO;
import com.ailenweb.CustomerDataManagement.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	private CustomerDAO dao;
	
	public Customer saveCustomer(Customer customer)
	
	{
		return dao.saveCustomer(customer);
	}
	
	public Customer UpdateCustomer(Customer customer)
	{
		return dao.updateCustomer(customer);
	}
	
	public List<Customer> getAll()
	{
		return dao.getAllDetails();
	}
	public Customer getById(int id)
	{
		return dao.getCustomerDataById(id);
	}
	
	public Customer deleteById(int id)
	{
		return dao.deleteCustomerDataByid(id);
	}

}
