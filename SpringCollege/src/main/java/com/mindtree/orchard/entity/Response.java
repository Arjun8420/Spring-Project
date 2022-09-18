package com.mindtree.orchard.entity;

import java.util.List;

public class Response
{
	
	private College college;
	private List<Student> student;
	
	public College getCollege() 
	{
		return college;
	}
	
	public void setCollege(College college) 
	{
		this.college = college;
	}
	
	public List<Student> getStudent() 
	{
		return student;
	}
	
	public void setStudent(List<Student> student)
	{
		this.student = student;
	}
	
	public Response(College college, List<Student> student) 
	{
		super();
		this.college = college;
		this.student = student;
	}
	
	public Response() 
	{
		super();
	}
}
