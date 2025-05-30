package com.employee.employee_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class eService {
	
	@Autowired
	private EmployeeRepository eRepo;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient webClient;
	@Autowired
	private APIClient apiclient;
	
	
	public ResponseDTO createEmployee(RequestDTO r) {
		var e = eRepo.save(EmployeeMapper.toEntity(r));
		
		return EmployeeMapper.toDto(e);
	}

	public APIResponseDTO getById(int id) {
		
		var e = eRepo.findById(id).orElse(null);
//		var responseEntity= restTemplate.getForEntity("http://localhost:8081/d/code/"+e.getDcode(),DepartmentDTO.class);  // take this.
//		var departmentDTO = responseEntity.getBody();
		
//		var departmentDTO=webClient.get()
//			.uri("http://localhost:8081/d/code/"+e.getDcode(),DepartmentDTO.class)
//			.retrieve()
//			.bodyToMono(DepartmentDTO.class)
//			.block();
		
		var departmentDTO = apiclient.getByCode(e.getDcode());
		
		return new APIResponseDTO(departmentDTO,EmployeeMapper.toDto(e));
		
	}

}
