package com.mindtree.orchard.SpringStudent;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.entity.CollectionOfStudents;
import com.mindtree.orchard.entity.Student;
import com.mindtree.orchard.implementation.StudentImplimentation;

@SpringBootTest
class SpringStudentApplicationTests 
{

	@Autowired
	private StudentImplimentation studentservice;
       
	@Test
	public void getAllStudents() 
	{
		List<Student> e=studentservice.getAllStudents();
		assertThat(e).size().isGreaterThan(0);
	}
	
	@Test
	public void getStudentDetails() 
	{
		Student s=studentservice.getStudent(4);
		assertEquals("Nithin",s.getStudentName());
	}
	
	@Test
	public void getAllStudentsByCollege() 
	{
		CollectionOfStudents e = studentservice.getStudentByDepartment(102);
		List<Student> s = e.getStudent();
		assertEquals(102,s.get(0).getCollegeid());
	}

}
