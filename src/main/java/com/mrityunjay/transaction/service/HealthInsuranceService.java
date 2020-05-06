package com.mrityunjay.transaction.service;

import com.mrityunjay.transaction.model.EmployeeHealthInsurance;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public interface HealthInsuranceService {
	
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	public void deleteEmployeeHealthInsuranceById(String empid);
	
}