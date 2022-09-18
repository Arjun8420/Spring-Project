package com.mindtree.orchard.entity;

import java.util.List;

public class CollegeResponse
{
	
	private List<College> col;

	public List<College> getCol() 
	{
		return col;
	}

	public void setCol(List<College> col) 
	{
		this.col = col;
	}

	public CollegeResponse(List<College> col)
	{
		super();
		this.col = col;
	}

	public CollegeResponse()
	{
		super();
	}
}
