package com.apps;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class EmpApp2 {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)fact.getBean("empObj");
		
		System.out.println("Emp No : " + emp.getEmpno());
		System.out.println("Emp Name : " + emp.getEname());
		System.out.println("Emp Job : " + emp.getJob());
		System.out.println("Emp Salary : " + emp.getSalary());
	}

}
