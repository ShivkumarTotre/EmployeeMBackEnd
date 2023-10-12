package com.EmployeeManagement.EmployeeManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.EmployeeManagement.EmployeeManagement.Model.*;
import com.EmployeeManagement.EmployeeManagement.Repo.*;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeInfoable empRepo;
	
	public void addEmployee(EmployeeInfo emp)
	{
		empRepo.save(emp);
	}
	
	@Autowired
    private EmpInfoable emplist;
	
	public String list(Model model) {
  //  List<EmpInfoable> entities = emplist.findAll();
    //model.addAttribute("entities", entities);
    return "list";
}

}
