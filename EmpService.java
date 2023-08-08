package com.Subha.ineuron.q24.Q24.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.Subha.ineuron.q24.Q24.Entity.Employee;

@Component
public interface EmpService extends CrudRepository<Employee,Integer>{
	
	

}
