package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;

@RestController
public class HomeController 
{
	@RequestMapping(" ")
	public String preCheck()
	{
		return "WelCome..!!";
	}
	
	@RequestMapping("/")
	public Student preLogin()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("ABC");
		s.setAddress("Pune");
		
		return s;
	}
	
	@RequestMapping("/list")
	public List listData()
	{
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("PQR");
		s1.setAddress("Nagpur");
		
		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("MNP");
		s2.setAddress("Satara");
		
		List<Student> li=new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		
		return li;
	}

}
