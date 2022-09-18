package com.mindtree.orchard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer studentId;
	private String studentName;
	private String gender;
	private int age;
	private String stream;
	private int collegeid;
	
	public Student(Integer studentId, String studentName, String gender, int age, String stream, int collegeid) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.age = age;
		this.stream = stream;
		this.collegeid = collegeid;
	}
	
	public Student() {
	}
	
	public Integer getStudentId() 
	{
		return studentId;
	}
	
	public void setStudentId(Integer studentId)
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
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getStream()
	{
		return stream;
	}
	
	public void setStream(String stream)
	{
		this.stream = stream;
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
