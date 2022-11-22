package com.deloitte.customer.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.customer.ms.entity.Customers;
import com.deloitte.customer.ms.model.FailureResponse;
import com.deloitte.customer.ms.model.Order;
import com.deloitte.customer.ms.model.Response;
import com.deloitte.customer.ms.repo.CustomerRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Customers>> getCustomers(){
		List<Customers> customerList = customerRepository.findAll();
		return new ResponseEntity<List<Customers>>(customerList,HttpStatus.OK);		
	}
	
	@GetMapping("/get/{id}")
	@HystrixCommand(fallbackMethod = "orderFallbackFailure")
	public ResponseEntity<?> getCustomer(@PathVariable("id") Integer id){
		
		Customers customers = customerRepository.findById(id).get();
//		
//		
//
//		Department dept = restTemplate.getForObject("http://localhost:8082/department/getDept/"+id, Department.class);
//		List<Project> projectList = restTemplate.getForObject("http://localhost:8083/projectss/getProject/"+id, List.class);
//	
		

		
		List<Order> orderList = restTemplate.getForObject("http://localhost:8082/orders/getOrder/"+id, List.class);
		List<Order> orderList1 = restTemplate.getForObject("http://localhost:8082/orders/getOrder/"+id, List.class);
		Response response = new Response(customers,orderList, orderList1);
		return new ResponseEntity<Response>(response,HttpStatus.OK);		
	}
	
	public ResponseEntity<?> orderFallbackFailure(@PathVariable("id") Integer id){
		
		Customers customers = customerRepository.findById(id).get();
		FailureResponse response = new FailureResponse(customers, "Currently Order Service is Down");
		return new ResponseEntity<FailureResponse>(response,HttpStatus.OK);
	}
}









