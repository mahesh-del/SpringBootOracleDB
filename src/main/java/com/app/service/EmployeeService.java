package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	public Employee getEmployeeByFirstName(String name)
	{
		return repository.findByFirstName(name);
	}
	
	public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
	
	public List<Employee> getEmployees()
	{
		return repository.findAll();
	}
}
