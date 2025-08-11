package com.example.springboot.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.School;

import com.example.springboot.repo.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {
	
	
	private final SchoolRepository schoolRepository;

	@Override
	public School save(School school) {
		
		return schoolRepository.save(school);
	}

	@Override
	public School findSchoolById(Long id) {
		return schoolRepository.findById(id).get();
	}

	@Override
	public List<School> getAllSchools() {
		
		return schoolRepository.findAll();
	}

	@Override
	public void deleteSchoolById(Long id) {
		
		schoolRepository.deleteById(id);
		
	}

	@Override
	public School updateSchool(Long id, School school) {
		
		School existedSchool = schoolRepository.findById(id).
				orElseThrow(()-> new RuntimeException("School with this id is not present" + id));
		existedSchool.setSchoolName(school.getSchoolName());
		existedSchool.setSchoolAddress(school.getSchoolAddress());
		existedSchool.setTeachers(school.getTeachers());
		return schoolRepository.save(existedSchool);
	}

	@Override
	public School patchSchoolById(Long id, School school) {
		School existedSchool = schoolRepository.findById(id).
				orElseThrow(()-> new RuntimeException("School with this id is not present" + id));
		if(school.getSchoolName()!=null) {
			existedSchool.setSchoolName(school.getSchoolName());
		}
		if(school.getSchoolAddress()!=null) {
			existedSchool.setSchoolAddress(school.getSchoolAddress());
		}
		if(school.getTeachers()!=null) {
			existedSchool.setTeachers(school.getTeachers());
		}
		
		return schoolRepository.save(existedSchool);
	}

	
	@Override
	public School findSchoolBySchoolName(String schoolName) {
		return schoolRepository.findSchoolBySchoolName(schoolName);
		
	}

	@Override
	public School findSchoolBySchoolAddress(String schoolAddress) {
		return schoolRepository.findSchoolBySchoolAddress(schoolAddress);
	}
	
	
	
	

	

	
	

}
