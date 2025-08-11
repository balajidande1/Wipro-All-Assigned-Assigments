package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Teacher;

public interface TeacherService {

	Teacher save(Teacher teacher);

	Teacher findTeacherById(Long id);

	List<Teacher> findAllTeachers();

	void deleteTeacherById(Long id);

	Teacher updateTeacher(Long id, Teacher teacher);

	Teacher patchTeacherById(Long id, Teacher teacher);

}
