package com.fis.springjdbc.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployee {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoexample.xml");
		EmployeeDAOImpl bean = context.getBean("employeeDao", EmployeeDAOImpl.class);
		System.out.println("===============================");
		System.out.println("Insert a Employee");
		Employee newEmployee = new Employee();
		newEmployee.setId(103);
		newEmployee.setName("Pranitha"); 
		bean.insertEmployee(newEmployee);
		System.out.println("================================");
		System.out.println("Delete Employee");
		int id = 10;
		bean.deleteEmployee(id);
		System.out.println("===============================");
		System.out.println("Get Employee Based on Id");
		id = 20;
		Employee employeeById = bean.getEmployeeById(id);
		System.out.println(employeeById.toString());
		System.out.println("===============================");
		System.out.println("Update Employee");
		newEmployee = new Employee();
		newEmployee.setId(20);
		newEmployee.setName("tania");
		bean.updateEmployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Get All Employees");
		System.out.println(bean.getAllEmployees());
		System.out.println("===============================");

		context.close();
	}
}