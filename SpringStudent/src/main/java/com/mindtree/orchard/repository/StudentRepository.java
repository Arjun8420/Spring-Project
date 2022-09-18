package com.mindtree.orchard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orchard.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

	List<Student> findByCollegeid(Integer collegeid);
	List<Student> findByStream(String stream);

}
