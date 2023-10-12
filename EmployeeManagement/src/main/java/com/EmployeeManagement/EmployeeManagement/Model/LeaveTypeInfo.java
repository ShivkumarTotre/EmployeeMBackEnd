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
@Table(name="leave_type")

public class LeaveTypeInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_type_id;
	
	@Column(name="leave_name")
	private String leave_name;

	public LeaveTypeInfo() {
		super();
	}

	public LeaveTypeInfo(int leave_type_id, String leave_name) {
		super();
		this.leave_type_id = leave_type_id;
		this.leave_name = leave_name;
	}

}
