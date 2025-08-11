package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.School;
import com.example.springboot.service.SchoolService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SchoolController {
	
	
	private final SchoolService schoolService;
	
	@PostMapping("/addNewSchool")
	private School addNewSchool(@RequestBody School school) {
		return schoolService.save(school);
	}
	
	@GetMapping("/getSchool/{id}")
	public School getSchoolById(@PathVariable Long id) {
		return schoolService.findSchoolById(id);
	}
	
	@GetMapping("/getAllSchools")
	public List<School> getAllSchools(){
		return schoolService.getAllSchools();
	}
	
	@DeleteMapping("/deleteSchoolById/{id}")
	public void deleteSchool(@PathVariable Long id) {
		schoolService.deleteSchoolById(id);
	}
	
	@PutMapping("/updateSchool/{id}")
	public School updateSchool(@PathVariable Long id, @RequestBody School school) {
		return schoolService.updateSchool(id, school);
	}
	
	@PatchMapping("/patchSchool/{id}")
	public School patchSchool(@PathVariable Long id, @RequestBody School school) {
		return schoolService.patchSchoolById(id, school);
	}
	
	@GetMapping("/getSchoolByName/{schoolName}")
	public School findByName(@PathVariable String schoolName) {
		return schoolService.findSchoolBySchoolName(schoolName);
	}
	
	@GetMapping("/getSchoolByAddress/{schoolAddress}")
	public School findByAddress(@PathVariable String schoolAddress) {
		return schoolService.findSchoolBySchoolAddress(schoolAddress);
	}
	

}
