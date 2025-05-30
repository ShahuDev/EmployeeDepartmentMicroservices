package com.department.department_service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DService {
	
	@Autowired
	private DepartmentRepository dRepo;

	public ResponseDTO createDepartment(RequestDTO request) {
		var saved = dRepo.save(DepartmentMapper.toEntity(request));
		return DepartmentMapper.toDto(DepartmentMapper.toEntity(request));
	}
	
	public List<ResponseDTO> getDepartments() {
		var list = dRepo.findAll();
		return list.stream().map(DepartmentMapper::toDto).toList();
	}
	public ResponseDTO getByCode(String code) {
		var d = dRepo.findByCode(code);
		return DepartmentMapper.toDto(d);
	}

}
