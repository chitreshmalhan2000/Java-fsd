package com.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beans.Employee;

public class EmpApp1 {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("config.xml");
		BeanFactory fact = new XmlBeanFactory(rs);
		Employee emp = (Employee)fact.getBean("empObj");
		
		System.out.println("Emp No : " + emp.getEmpno());
		System.out.println("Emp Name : " + emp.getEname());
		System.out.println("Emp Job : " + emp.getJob());
		System.out.println("Emp Salary : " + emp.getSalary());

	}

}
