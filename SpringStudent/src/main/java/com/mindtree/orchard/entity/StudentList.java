package com.mindtree.orchard.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentList 
{
	
	private List<Student> lis=new ArrayList<>();

	public List<Student> getLis()
	{
		return lis;
	}

	public void setLis(List<Student> lis) 
	{
		this.lis = lis;
	}
	
}
