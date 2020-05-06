package com.mrityunjay.transaction.service;

import com.mrityunjay.transaction.model.Employee;
import com.mrityunjay.transaction.model.EmployeeHealthInsurance;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}