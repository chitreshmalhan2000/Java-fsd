package com.apps;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.beans.StdInfo;
import com.beans.Student;

public class StdApp2 {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("config2.xml");
		
		StdInfo std = (StdInfo)fact.getBean("stdObj");
		std.PrintStdInfo();
	}

}
