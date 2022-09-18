package com.mindtree.orchard.implementation;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.mindtree.orchard.entity.CollectionOfStudents;
import com.mindtree.orchard.entity.Student;
import com.mindtree.orchard.interfaces.StudentInterface;
import com.mindtree.orchard.repository.StudentRepository;

@Component
@Service
public class StudentImplimentation implements StudentInterface 
{

	@Autowired
	private StudentRepository studentrepo;
		
	@Override
	public List<Student> getAllStudents() 
	{
		return studentrepo.findAll();
	}

	public Student getStudent(Integer studentid) 
	{
		studentrepo.findById(studentid);
		return studentrepo.findById(studentid).get();
	}

	public Student addStudent(Student stu)
	{
		return studentrepo.save(stu);
	}

	public CollectionOfStudents getStudentByDepartment(Integer collegeid)
	{
		List<Student> sts = studentrepo.findByCollegeid(collegeid);
		java.util.Comparator<Student> com=new java.util.Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				if(o1.getAge()>o2.getAge()) 
				{
					return -1;
				}
				else 
				{
				return 1;
				}
			}
		};
		
		Collections.sort(sts, com);
		CollectionOfStudents c=new CollectionOfStudents(sts);
		
		return c;
	}

	public List<Student> getStudentByStream(String stream) 
	{
		List<Student> st=studentrepo.findByStream(stream);
		java.util.Comparator<Student> com=new java.util.Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2) 
			{
				if(o1.getAge()>o2.getAge()) 
				{
					return -1;
				}
				else 
				{
				return 1;
				}
			}
		};
		
		Collections.sort(st, com);
		return st;
	}
}
