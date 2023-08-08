package com.Subha.ineuron.q24.Q24.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Subha.ineuron.q24.Q24.Entity.Employee;
import com.Subha.ineuron.q24.Q24.Services.EmpService;

@Component
public class EmployeeDao {
	
	@Autowired
	EmpService empService;
	
	public List<Employee> postAll(List<Employee> Employees){
		
		List<Employee> empList = null;
		
		empList=(List<Employee>)empService.saveAll(Employees);
		
		return empList;
		
		
	}
	

}
