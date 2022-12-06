package com.shiva.empproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.empproject.entity.Employee;
import com.shiva.empproject.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
 
	public Employee addEmployee(Employee employee) {
		Employee emp = repository.save(employee);
		 
		return emp;
	}
	
	public List<Employee> addAllEmployees(List<Employee> employees){
		return repository.saveAll(employees);
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Employee getEmployeeByName(String name) {
		return repository.getByName(name);
	}
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existingEMployee=repository.findById(employee.getId()).orElse(null);
		  
		existingEMployee.setName(employee.getName());
		existingEMployee.setAge(employee.getAge());
		existingEMployee.setName(employee.getMobileNumber());
		existingEMployee.setMobileNumber(employee.getMobileNumber());
		existingEMployee.setEmail(employee.getEmail());
		existingEMployee.setRole(employee.getRole());
		
		return repository.save(existingEMployee);
	}
	
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee deleted successfully";
	}	
}
