package com.mrityunjay.transaction.service;

import com.mrityunjay.transaction.model.Employee;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public interface EmployeeService {
	
	public void insertEmployee(Employee emp);

	public void deleteEmployeeById(String empid);
	
}
