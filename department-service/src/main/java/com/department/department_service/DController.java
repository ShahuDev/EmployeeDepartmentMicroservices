package com.department.department_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/d")
public class DController {
	
	@Autowired
	private DService dservice;
	
	@PostMapping("/create")
	public ResponseDTO createDepartment(@RequestBody RequestDTO request) {
		return dservice.createDepartment(request);
	}
	@GetMapping("/list")
	public List<ResponseDTO> listAll(){
		return dservice.getDepartments();
	}
	@GetMapping("/code/{code}")
	public ResponseDTO getByCode(@PathVariable String code){
		return dservice.getByCode(code);
	}

}
