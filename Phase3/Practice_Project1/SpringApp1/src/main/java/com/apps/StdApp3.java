package com.apps;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.beans.StdBiodata;
import com.beans.StdInfo;
import com.beans.Student;

public class StdApp3 {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("config3.xml");
		
		StdBiodata std = (StdBiodata)fact.getBean("stdObj");
		
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Qualifications : " + std.getQualification());
		System.out.println("Courses : " + std.getCourses());
		System.out.println("Course and Faculty : " + std.getCourse_and_faculty());
		System.out.println("Course and Cost : " + std.getCourse_and_cost());
	} 
}
