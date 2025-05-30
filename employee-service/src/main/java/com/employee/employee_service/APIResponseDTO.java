package com.employee.employee_service;
/*
 * This is made in order to sync both department and employee dto.
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIResponseDTO {
	
	private DepartmentDTO departmentDTO;
	private ResponseDTO employeeDTO;

}
