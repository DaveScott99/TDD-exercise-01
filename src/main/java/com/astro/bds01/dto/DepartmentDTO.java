package com.astro.bds01.dto;

import com.astro.bds01.entities.Department;

public class DepartmentDTO {

	private Long id;
	private String name;
	
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
