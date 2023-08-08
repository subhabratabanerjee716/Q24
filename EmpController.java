package com.Subha.ineuron.q24.Q24.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Subha.ineuron.q24.Q24.Entity.*;
import com.Subha.ineuron.q24.Q24.Dao.EmployeeDao;

@RestController
public class EmpController {
	@Autowired
	EmployeeDao empDao;
	
	@PostMapping("/postAll")
	public List<Employee> postAll(@RequestBody List<Employee> empL){
		
		
		return empDao.postAll(empL);
		
		
	}

}
