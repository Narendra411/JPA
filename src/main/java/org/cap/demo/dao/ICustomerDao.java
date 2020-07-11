package org.cap.demo.dao;

import javax.transaction.Transactional;

import org.cap.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
//@Transactional
public interface ICustomerDao extends JpaRepository<Customer, Integer>{
	
}
