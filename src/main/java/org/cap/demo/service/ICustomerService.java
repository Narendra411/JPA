package org.cap.demo.service;

import java.util.List;

import org.cap.demo.model.Customer;

public interface ICustomerService {
	public List<Customer> saveCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
