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

import com.example.springboot.entity.Teacher;
import com.example.springboot.service.TeacherService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TeacherController {
	
	
	private final TeacherService teacherService;
	
	@PostMapping("/addNewTeacher")
	public Teacher addNewTeacher(@RequestBody Teacher teacher) {
		return teacherService.save(teacher);
	}
	
	@GetMapping("/getTeacher/{id}")
	public Teacher getTeacher(@PathVariable Long id) {
		return teacherService.findTeacherById(id);
	}
	
	@GetMapping("/getAllTeachers")
	public List<Teacher> getAllTeachers(){
		return teacherService.findAllTeachers();
	}
	
	@DeleteMapping("/deleteTeacher/{id}")
	public void deleteTeacher(@PathVariable Long id) {
		teacherService.deleteTeacherById(id);
	}
	
	@PutMapping("/updateTeacher/{id}")
	public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
	
	@PatchMapping("/patchTeacher/{id}")
	public Teacher patchTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
		return teacherService.patchTeacherById(id, teacher);
	}

}
