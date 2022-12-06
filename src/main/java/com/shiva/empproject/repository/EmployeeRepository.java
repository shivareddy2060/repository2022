package com.shiva.empproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiva.empproject.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	

	Employee getByName(String name);

	

}
