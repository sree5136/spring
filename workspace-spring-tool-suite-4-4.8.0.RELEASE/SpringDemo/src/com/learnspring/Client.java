package com.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

		public static void main(String[] args) {
			Employee e = new Employee();
			e.setEid(1);
			e.setEname("Krishna");
			e.seteSalary(500000d);
			
			System.out.println(e);
			ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
//			Employee e1 = (Employee) context.getBean("emp1");		

			
	       System.out.println("---------------------------------------- spring IOC in action ----------------------");
//	       System.out.println(e1);
			
		}
	
	
	
}
