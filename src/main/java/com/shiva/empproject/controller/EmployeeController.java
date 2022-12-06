package com.shiva.empproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shiva.empproject.entity.Employee;
import com.shiva.empproject.service.EmployeeService;

public class EmployeeController {
	
	 @Autowired
     private EmployeeService service;
 
	 @PostMapping("/Add")
     public Employee addEmployee(@RequestBody Employee employee) {
    	 return service.addEmployee(employee);
     }
	 
	 @PostMapping("/AddAll")
	 public List<Employee> addAllEmployee(@RequestBody List<Employee> employees){
		 return service.addAllEmployees(employees);
	 }
	 
	 
	 @GetMapping("/getid/id")
	 public Employee getEmployeeById(@PathVariable int id) {
		 return service.getEmployeeById(id);
	 }
	 
	 @GetMapping("/getname/name")
	 public Employee getEmployeeByName(String name) {
		 return service.getEmployeeByName(name);
	 }
	 
	 @GetMapping("/getall")
	 public List<Employee> getAllEmployee(){
		 return service.getAllEmployees();
	 }
	 
	 @PutMapping("/update/id")
	 public Employee updateEmployeebyId(@PathVariable Employee id) {
		 return service.updateEmployee(id);
	 }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
