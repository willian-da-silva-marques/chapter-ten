package com.ocajexam.chapter.ten;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Despertador {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime condition = null;
		do {
			condition = LocalDateTime.now();
			Thread.sleep(10000);
			System.out.println(getHour(condition.toLocalTime()));
		} while (condition.toLocalDate().getDayOfMonth() == 27);
	}

	private static String getHour(LocalTime localTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		return localTime.format(formatter);
	}
}