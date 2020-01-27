package com.ocajexam.chapter.ten;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TestLocalDate {

	public static void main(String[] args) {
//		String text = "07/06/2013 10:11:60";// lança uma DateTimeParseException
		String text = "07/06/2013 10:11:59";
		System.out.println(converterStringToDate(text));
	}

	private static LocalDate converterStringToDate(String text) {
		LocalDate localDate = null;
		try {			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			localDate = LocalDateTime.parse(text, formatter).toLocalDate();
			return localDate;
		} catch (DateTimeParseException e) {
			System.out.println(e.getMessage());
		}
		return localDate;
	}
}
