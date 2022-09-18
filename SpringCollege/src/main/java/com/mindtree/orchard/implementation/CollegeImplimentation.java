package com.mindtree.orchard.implementation;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindtree.orchard.entity.CollectionOfStudents;
import com.mindtree.orchard.entity.College;
import com.mindtree.orchard.entity.Response;
import com.mindtree.orchard.entity.Student;
import com.mindtree.orchard.repository.CollegeRepository;

@Component
@Service
public class CollegeImplimentation 
{
	
	@Autowired
	private CollegeRepository collegerepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public College findCollegById(Integer id) 
	{
		return collegerepo.findById(id).get() ;
	}

	public College addCollege(College col) 
	{
		return collegerepo.save(col);
	}

	public List<College> getAllColleges() 
	{
		return collegerepo.findAll();
	}

	public List<Response> getAllCollegeStudentInfo() 
	{
		List<Response> res=new ArrayList<>();
		
		List<College> collegelist=collegerepo.findAll();
		
		for(int i=0;i<collegelist.size();i++) {
			College col=collegelist.get(i);
		 CollectionOfStudents sts = restTemplate.getForObject("http://student/students/college/"+col.getCollegeid(), CollectionOfStudents.class);
			List<Student> studen=sts.getStudent();
			java.util.Comparator<Student> com=new java.util.Comparator<Student>() {
				
				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getStudentName().compareToIgnoreCase(o2.getStudentName());
				}
			};
			
			Collections.sort(studen, com);
		 res.add(new Response(col, studen));
		}
		return res;
	}
}

//Hardcoded values
//restTemplate.getForObject("https://localhost:/college", CollectionOfCollege.class);
//List<College> collegelist=colleges.getCol();
// TODO Auto-generated method stub
//	List<CollegeStudent> res=new ArrayList<>();
//List<College> colleges=new ArrayList<>();
//colleges.add(new College(1, "ABC", 11));
//colleges.add(new College(2, "DEF", 22));
//colleges.add(new College(3, "GHI", 33));
//colleges.add(new College(4, "JKL", 44));

//for(int i=0;i<colleges.size();i++) {
//	College col=colleges.get(i);
//	List<Student> sts=new ArrayList<>();
//	sts.add(new Student(5, "MNO",2022,100));
//	sts.add(new Student(6, "PQR",2022,100));
//	sts.add(new Student(7, "STU",2022,100));
//	res.add(new CollegeStudent(col, sts));