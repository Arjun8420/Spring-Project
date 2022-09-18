package com.mindtree.orchard.entity;

public class Response
{
	
	private College college;
	private Student student;
	
	public Response(College college, Student student) 
	{
		super();
		this.college = college;
		this.student = student;
	}
	
	public Response() 
	{
		super();
	}
	
	public College getCollege()
	{
		return college;
	}
	
	public void setCollege(College college) 
	{
		this.college = college;
	}
	
	public Student getStudent() 
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student = student;
	}
}
