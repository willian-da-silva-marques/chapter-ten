package com.ocajexam.chapter.ten;

import java.time.LocalDateTime;
import java.time.Period;

public class TestLocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime startDateInclusive = LocalDateTime.of(1900,9,1,1,06,32,1000000);
		System.out.println(startDateInclusive);
		LocalDateTime endDateExclusive = LocalDateTime.now();
		Period period = Period.between(startDateInclusive.toLocalDate(), endDateExclusive.toLocalDate());
		
		System.out.println("A diferença é de " + period.getYears() + " anos " + period.getMonths() + " mêses e " + period.getDays() + " dias.");
	}
}