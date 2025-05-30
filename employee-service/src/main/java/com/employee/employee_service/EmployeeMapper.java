package com.employee.employee_service;

public class EmployeeMapper {

    // Convert RequestDTO to Employee entity (for saving)
    public static Employee toEntity(RequestDTO dto) {
        Employee employee = new Employee();
        employee.setName(dto.name());
        employee.setEmail(dto.email());
        employee.setDcode(dto.Dcode());
        return employee;
    }

    // Convert Employee entity to ResponseDTO (for returning data)
    public static ResponseDTO toDto(Employee employee) {
        return new ResponseDTO(employee.getId(),employee.getName(), employee.getEmail(),employee.getDcode());
    }
}

