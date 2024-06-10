package com.springCoreAnnotion.AnnotionConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.springCoreAnnotion.College;
import com.springCoreAnnotion.University;
import com.springCoreAnnotion.configForCollege;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotionConfigApplication {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(configForCollege.class);
		College collegeBean = context.getBean("collegeBean" , College.class);
		System.out.println("\n\nCollege Object : "+ collegeBean);
		College colloege = context.getBean("collegeBean" , College.class);
		System.out.println("\n\nCollege Object : "+ colloege);

		//University uniObj = context.getBean("UniBean" , University.class);
		//System.out.println("\n\nUniversity Object : "+uniObj);
	}

}
