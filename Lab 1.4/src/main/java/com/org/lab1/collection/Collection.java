package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(01, "anu",20800.0));
		empList.add(new Employee(02,"anni",83100.0));
		empList.add(new Employee(03,"ritik", 15000.0));
		empList.add(new Employee(04,"Ankit",55000.0));
		
		return empList;
	}
}
