package com.employee.employee_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="http://localhost:8081",value="DEPARTMENT-SERVICE")
@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {
	
	@GetMapping("/d/code/{code}")
	  DepartmentDTO getByCode(@PathVariable String code);
	
}
