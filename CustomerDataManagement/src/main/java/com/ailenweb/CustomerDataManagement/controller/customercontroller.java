package com.ailenweb.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ailenweb.CustomerDataManagement.entity.Customer;
import com.ailenweb.CustomerDataManagement.service.CustomerService;

@RestController
public class customercontroller {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public @ResponseBody Customer saveCustomerDetails(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
	}
	
	
	@PutMapping("/customer")
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer)
	{
		return service.UpdateCustomer(customer);
	}

	@GetMapping("customer")
	public @ResponseBody List<Customer> getAllCustomerData()
	{
		return service.getAll();
	}
	
	@GetMapping("customer/{id}")
	public @ResponseBody Customer getDataById(@PathVariable("id") int id)
	{
		return service.getById(id);
	}
	
	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteById(@RequestParam(name = "id") int id)
	{
		return service.deleteById(id);
	}
 }
