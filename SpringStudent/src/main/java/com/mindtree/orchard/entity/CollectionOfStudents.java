package com.mindtree.orchard.entity;

import java.util.List;

public class CollectionOfStudents 
{
	
	private List<Student> student;

	public CollectionOfStudents() 
	{
		super();
	}

	public CollectionOfStudents(List<Student> student) 
	{
		super();
		this.student = student;
	}

	public List<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(List<Student> student) 
	{
		this.student = student;
	}
}
