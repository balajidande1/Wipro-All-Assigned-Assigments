package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.springboot.entity.Teacher;
import com.example.springboot.repo.TeacherRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
	
	
	private final TeacherRepository teacherRepository;

	@Override
	public Teacher save(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher findTeacherById(Long id) {
		
		return teacherRepository.findById(id).get();
	}

	@Override
	public List<Teacher> findAllTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public void deleteTeacherById(Long id) {
		teacherRepository.deleteById(id);
		
	}

	@Override
	public Teacher updateTeacher(Long id, Teacher teacher) {
		Teacher existedTeacher = teacherRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Teacher with id is not present" + id));
		existedTeacher.setTeacherName(teacher.getTeacherName());
		existedTeacher.setTeacherAddress(teacher.getTeacherAddress());
		existedTeacher.setQualification(teacher.getQualification());
		existedTeacher.setAge(teacher.getAge());
		existedTeacher.setDob(teacher.getDob());
		existedTeacher.setExperience(teacher.getExperience());
		return teacherRepository.save(existedTeacher);
	}

	@Override
	public Teacher patchTeacherById(Long id, Teacher teacher) {
		Teacher existedTeacher = teacherRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Teacher with id is not present" + id));
		
		if(teacher.getTeacherName()!=null) {
			existedTeacher.setTeacherName(teacher.getTeacherName());
		}
		if(teacher.getTeacherAddress()!=null) {
			existedTeacher.setTeacherAddress(teacher.getTeacherAddress());
		}
		if(teacher.getQualification()!=null) {
			existedTeacher.setQualification(teacher.getQualification());
		}
		if(teacher.getAge()!=0) {
			existedTeacher.setAge(teacher.getAge());
		}
		if(teacher.getDob()!=null) {
			existedTeacher.setDob(teacher.getDob());
		}
		if(teacher.getExperience()!=0) {
			existedTeacher.setExperience(teacher.getExperience());
		}
		return teacherRepository.save(existedTeacher);
	}
	
	

	

}
