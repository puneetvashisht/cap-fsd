package com.cpg.springbootdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpg.springbootdemo.entities.Employee;
import com.cpg.springbootdemo.repos.EmployeeRepo;


class Message{
	String text;
	
	

	public Message(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}


@RestController
@CrossOrigin("*")
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping("/")
	public Message add(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return new Message("Employee successfully inserted!!");
		
	}
	
	@GetMapping("/")
	public List<Employee> fetchAllEmployees(){
		return employeeRepo.findAll();
	}

}
