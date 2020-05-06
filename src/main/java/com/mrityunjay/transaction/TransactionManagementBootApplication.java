package com.mrityunjay.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mrityunjay.transaction.model.Employee;
import com.mrityunjay.transaction.model.EmployeeHealthInsurance;
import com.mrityunjay.transaction.service.OrganizationService;

/**
 * Starting point.
 * 
 * @author mrityunjaykumar
 *
 */
@SpringBootApplication
public class TransactionManagementBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TransactionManagementBootApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);
	}

}
