package com.mindtree.orchard.SpringCollege;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.entity.College;
//import com.mindtree.orchard.entity.Response;
import com.mindtree.orchard.implementation.CollegeImplimentation;

@SpringBootTest
class SpringCollegeApplicationTests 
{
	
	@Autowired
	CollegeImplimentation collimpli;
	
	@Test
	public void getAllCollege() 
	{
		List<College> r = collimpli.getAllColleges();
		assertThat(r).size().isGreaterThan(0);
	}
	
	@Test
	public void saveCollege() 
	{
		College c=new College( 101,"RV", 10500);
		collimpli.addCollege(c);
		assertNotNull(collimpli.findCollegById(105));
	}
	
	@Test
	public void findCollegeById() 
	{
		College c=collimpli.findCollegById(101);
		assertEquals("RV", c.getCollegeName());
	}
}
