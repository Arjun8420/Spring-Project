package com.mindtree.orchard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orchard.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
