package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.model.Customer;
import org.cap.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fidi/v1")
public class CustomerOrderController {

	@Autowired
	private ICustomerService customerService;

	@PostMapping(value = "/postAllOrders")
	public ResponseEntity<List<Customer>> postAllOders(@RequestBody Customer customer) {

		List<Customer> customerdetails = customerService.saveCustomer(customer);
		System.out.println("---Post all orders in controller---");
		if (customerdetails.isEmpty())
			return new ResponseEntity("Sorry Insertion failed!!", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<List<Customer>>(customerdetails, HttpStatus.OK);
	}

	@GetMapping("/Customers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> allCustomers = customerService.getAllCustomer();
		if (allCustomers.isEmpty() || allCustomers == null) {
			return new ResponseEntity("Sorry! No Customers are available!", HttpStatus.NOT_FOUND);
		}
		System.out.println("---Get All Customers in controller :----");
		return new ResponseEntity<List<Customer>>(allCustomers, HttpStatus.OK);

	}

}
