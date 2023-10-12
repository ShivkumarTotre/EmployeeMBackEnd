package com.EmployeeManagement.EmployeeManagement.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Employee")

public class EmpInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	
	@Column(name="emp_name")
	private String ename;
	
	@Column(name="email")
	private String email;
	
	@OneToOne
    @JoinColumn(name = "did", referencedColumnName = "dept_id")
	private DepartmentInfo deptId;

	public EmpInfo() {
		super();
	}

	public EmpInfo(int eid, String ename, String email, DepartmentInfo deptId) {
		super();
		this.emp_id = eid;
		this.ename = ename;
		this.email = email;
		this.deptId = deptId;
	}

}
