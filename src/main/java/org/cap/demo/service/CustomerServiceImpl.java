package org.cap.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.cap.demo.dao.ICustomerDao;
import org.cap.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao customerDao;
	
	public List<Customer> saveCustomer(Customer customer){
		customerDao.save(customer);
		System.out.println("Save all Customer info \n");
		return getAllCustomer();
	}
	
	public List<Customer> getAllCustomer(){
		System.out.println("Get all customer \n");
		return customerDao.findAll();
	}

}
