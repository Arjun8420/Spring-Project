package com.mindtree.orchard.entity;

public class Student 
{
	
	private Integer studentId;
	private String studentName;
	private int age;
	private int collegeid;
	
	public Student() 
	{
		super();
	}
	
	public Student(Integer studentId, String studentName, int age, int collegeid) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.collegeid = collegeid;
	}
	
	public Integer getStudentId() 
	{
		return studentId;
	}
	
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	
	public String getStudentName() 
	{
		return studentName;
	}
	
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public int getCollegeid() 
	{
		return collegeid;
	}
	
	public void setCollegeid(int collegeid) 
	{
		this.collegeid = collegeid;
	}
}
