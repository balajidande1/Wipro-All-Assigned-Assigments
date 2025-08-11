package com.example.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
