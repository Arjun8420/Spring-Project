package com.mindtree.orchard.entity;

import java.util.List;

public class CollectionOfCollege 
{
	
	private List<College> col;

	public CollectionOfCollege() 
	{
		super();
	}

	public CollectionOfCollege(List<College> col) 
	{
		super();
		this.col = col;
	}

	public List<College> getCol() 
	{
		return col;
	}

	public void setCol(List<College> col) 
	{
		this.col = col;
	}
}
