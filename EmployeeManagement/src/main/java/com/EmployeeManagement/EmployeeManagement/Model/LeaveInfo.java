package com.EmployeeManagement.EmployeeManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="leaveTable")
public class LeaveInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	
	@OneToOne
    @JoinColumn(name = "leavetype_id", referencedColumnName = "leave_type_id")
	private LeaveTypeInfo leavetypeId;
	
	@OneToMany
    @JoinColumn(name = "eid", referencedColumnName = "emp_id")
	private EmpInfo eId;
		
	@Column(name="start_date")
	private String start_date;
	
	@Column(name="end_date")
	private String end_date;
	
	@Column(name="description")
	private String description;

	public LeaveInfo() {
		super();
	}

	public LeaveInfo(int lid, LeaveTypeInfo leavetypeId, EmpInfo eId, String start_date, String end_date,
			String description) {
		super();
		this.lid = lid;
		this.leavetypeId = leavetypeId;
		this.eId = eId;
		this.start_date = start_date;
		this.end_date = end_date;
		this.description = description;
	}

}
