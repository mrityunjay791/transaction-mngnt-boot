package com.mrityunjay.transaction.dao;

import com.mrityunjay.transaction.model.Employee;

public interface EmployeeDao {
	
	public void insertEmployee(Employee cus);

	public void deleteEmployeeById(String empid);
	
}