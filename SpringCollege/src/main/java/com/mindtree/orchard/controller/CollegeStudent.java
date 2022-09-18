package com.mindtree.orchard.controller;

import java.util.List;

import com.mindtree.orchard.entity.College;
import com.mindtree.orchard.entity.Student;


public class CollegeStudent 
{
	private College col;
	private List<Student> sts;
	
	public College getCol() 
	{
		return col;
	}
	
	public void setCol(College col) 
	{
		this.col = col;
	}
	
	public List<Student> getSts() 
	{
		return sts;
	}
	
	public void setSts(List<Student> sts) 
	{
		this.sts = sts;
	}
	
	public CollegeStudent(College col, List<Student> sts) 
	{
		super();
		this.col = col;
		this.sts = sts;
	}
	
	public CollegeStudent() 
	{
		super();
	}
}
