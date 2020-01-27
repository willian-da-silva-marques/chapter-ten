package com.ocajexam.chapter.ten;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

public class Exercicio10_1 {

	public static void main(String[] args) throws InterruptedException {

		Period p1 = Period.parse("P0Y13M");
		System.out.println("Original: " + p1 + " Normalized: " + p1.normalized());

		Period p2 = Period.parse("P2Y-1M");
		System.out.println("Original: " + p2 + " Normalized: " + p2.normalized());

		Period p = Period.parse("P1Y");
		System.out.println(p.getMonths());

		System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));// LINHA 1
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));// LINHA 2
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));// LINHA 3
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));// LINHA 4
		try {
			System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));// LINHA 5
		} catch (UnsupportedTemporalTypeException e) {
			System.out.println(e.getMessage());
		}

		LocalDate ld = LocalDate.of(1940, Month.JANUARY, 3);
		ld = ld.minusYears(3).plusMonths(10).plusDays(15);
		ld.minusYears(10);
		System.out.println(ld.getMonth() + " " + ld.getYear());

		LocalTime meetingTime = LocalTime.of(12, 15);
		while (meetingTime.getMinute() <= 15) {
			LocalDateTime currentTime = LocalDateTime.now();
			int minute = currentTime.toLocalTime().getMinute();
			System.out.println(minute);
			checkLate(currentTime, meetingTime);
			Thread.sleep(1000);
		}
	}

	private static void checkLate(LocalDateTime currentTime,LocalTime meetingTime) throws InterruptedException {
		if (meetingTime.isBefore(currentTime.toLocalTime())) {
			System.out.println("You're late!");
		} else {
			System.out.println("There is a meeting later today.");
		}
	}
}