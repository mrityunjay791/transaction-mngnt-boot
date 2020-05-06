1.What are Database Transactions?

  A Database transaction is a single logical unit of work which accesses and possibly modifies the contents of a database.
  
  
We will be developing a Spring Boot + JDBC project for employee management. It will be having 3 services-

	-EmployeeService - The service will perform Employee Operations

	-HealthInsuranceService - The service will perform Employee Health Insurance Operations

	-OrganizationService - The service will perform Organization Level Operation like Employee joining and exit. It makes use of the EmployeeService and HealthInsuranceService


An application transaction is a sequence of application actions that are considered as a single logical unit by the application. 

For our application the joinOrganization method will be considered as one complete transaction. joinOrganization consists of two actions-

	- Persist Employee Information

	- Persist HealthInsurance Information

If due to any reason any one of the above action fails then the other action should also be roll backed. So if Employee Information gets inserted but suppose due to some reason persist HealthInsurance is not successful, then Employee Information should also be rollbacked. It means it is all or none for a logical unit of work. Similar will be the case for exitOrganization Method which will be considered as one unit of work.



Suppose the employeeService call is successful but due to some reason the healthInsuranceService call fails. What should happen in this case. In such a scenario the entry made in the employee table for the new employee should also be reverted. Let us see how our application will behave in such a scenario.
We are manually throwing an unchecked exception after the first service call is made.


Spring Boot implicitly creates a proxy for the transaction annotated methods. So for such methods the proxy acts like a wrapper which takes care of creating a transaction at the beginning of the method call and committing the transaction after the method is executed.