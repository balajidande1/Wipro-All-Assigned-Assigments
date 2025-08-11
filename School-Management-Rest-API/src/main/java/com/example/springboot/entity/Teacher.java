package com.example.springboot.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="teacher_table")
@Entity
public class Teacher {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String teacherName;
	private String teacherAddress;
	
	@Enumerated(EnumType.STRING)
	private Qualification qualification;
	private int age;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private int experience;
	
	public enum Qualification {
	    BTech,
	    MTECH,
	    MSC,
	    PHD,
	    OTHER
	}


}
