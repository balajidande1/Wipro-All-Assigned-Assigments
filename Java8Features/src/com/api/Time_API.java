package com.api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Time_API {

	public static void main(String[] args) {
		
		LocalTime today = LocalTime.now();
		System.out.println(today);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate ld = LocalDate.of(2001, 4, 29);
		Period p = Period.between(ld, date);
		System.out.println(p.getYears());
		
		LocalTime start = LocalTime.of(9, 50);
		LocalTime end = LocalTime.of(13, 30);
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMinutes());

	}

}
