package com.EmployeeManagement.EmployeeManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "leavetable")
public class LeaveInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_id")
    private int lid;

    @ManyToOne 
    @JoinColumn(name = "leave_type_id")
    private LeaveTypeInfo leavetypeId;

    @ManyToOne 
    @JoinColumn(name = "eid")
    private EmployeeInfo eId;

    @Column(name = "start_Date")
    private String startDate;

    @Column(name = "end_Date")
    private String endDate;

    @Column(name = "description")
    private String description;

   
}
