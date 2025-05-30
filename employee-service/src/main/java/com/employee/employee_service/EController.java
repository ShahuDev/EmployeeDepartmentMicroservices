package com.employee.employee_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EController {
	
	@Autowired
	public eService eservice;
	
	@PostMapping("/create")
	public ResponseDTO createEmployee(@RequestBody RequestDTO r ) {
		return eservice.createEmployee(r);
	}
	@GetMapping("/get/{id}")
	public APIResponseDTO getById(@PathVariable int id) {
		return eservice.getById(id);
	}

}
