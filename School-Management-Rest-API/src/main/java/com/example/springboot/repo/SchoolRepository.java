package com.example.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long>{

	School findSchoolBySchoolName(String schoolName);

	School findSchoolBySchoolAddress(String schoolAddress);

}
