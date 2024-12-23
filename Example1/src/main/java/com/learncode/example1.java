package com.learncode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learncode.beans.vehicle;
import com.learncode.config.ProjectConfig;

public class example1 {
public static void main(String[] args) {
//	vehicle vehicle1=new vehicle();
	
   var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
   vehicle v=context.getBean(vehicle.class);
   System.out.println(v.getName());
}
}
