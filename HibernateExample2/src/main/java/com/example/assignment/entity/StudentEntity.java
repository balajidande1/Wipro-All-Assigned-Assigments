package com.example.assignment.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "students")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String username;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String address;
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	public enum Gender{
		MALE, FEMALE, OTHER
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public StudentEntity(int rollno, String firstName, String lastName, String username, Gender gender, String address,
			Date dob) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.gender = gender;
		this.address = address;
		this.dob = dob;
	}
	
	public StudentEntity() {
	    // default constructor required by Hibernate
	}


	public StudentEntity(String string, String string2, String string3, Gender male, String string4, LocalDate of) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentEntity [rollno=" + rollno + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", gender=" + gender + ", address=" + address + ", dob=" + dob + "]";
	}
	
	

}
