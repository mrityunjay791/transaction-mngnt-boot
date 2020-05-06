package com.mrityunjay.transaction.dao;

import com.mrityunjay.transaction.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);
}