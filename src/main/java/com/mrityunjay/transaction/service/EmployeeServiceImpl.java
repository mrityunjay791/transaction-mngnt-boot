package com.mrityunjay.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrityunjay.transaction.dao.EmployeeDao;
import com.mrityunjay.transaction.model.Employee;

/**
 * Employee service implementation to insert or delete employee details.
 *  
 * @author mrityunjaykumar
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(String empid) {
		employeeDao.deleteEmployeeById(empid);
	}

	

}