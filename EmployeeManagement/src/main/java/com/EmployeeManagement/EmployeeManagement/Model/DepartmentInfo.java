package com.EmployeeManagement.EmployeeManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Department")
public class DepartmentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	
	@Column(name="dept_name")
	private String dept_name;

	public DepartmentInfo() {
		super();
	}

	public DepartmentInfo(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

}
