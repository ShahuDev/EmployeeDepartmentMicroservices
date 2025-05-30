package com.department.department_service;

public class DepartmentMapper {

    // Convert RequestDTO to Department entity (for saving)
    public static Department toEntity(RequestDTO dto) {
        Department department = new Department();
        department.setName(dto.name());
        department.setCode(dto.code());
        return department;
    }

    // Convert Department entity to ResponseDTO (for returning data)
    public static ResponseDTO toDto(Department department) {
        return new ResponseDTO(department.getId(), department.getName(), department.getCode());
    }
}

