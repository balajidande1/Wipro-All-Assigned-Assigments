package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.School;

public interface SchoolService {

	School save(School school);

	School findSchoolById(Long id);

	List<School> getAllSchools();

	void deleteSchoolById(Long id);

	School updateSchool(Long id, School school);

	School patchSchoolById(Long id, School school);

	
	
	School findSchoolBySchoolName(String schoolName);

	School findSchoolBySchoolAddress(String schoolAddress);


}
