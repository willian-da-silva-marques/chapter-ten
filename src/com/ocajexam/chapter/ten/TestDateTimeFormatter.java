package com.ocajexam.chapter.ten;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TestDateTimeFormatter {

	public static void main(String[] args) {
		List<DateTimeFormatter> formatters = new ArrayList<>();
		formatters.add(DateTimeFormatter.BASIC_ISO_DATE);
		formatters.add(DateTimeFormatter.ISO_LOCAL_TIME);
		formatters.add(DateTimeFormatter.ISO_LOCAL_DATE);
		formatters.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		formatters.add(DateTimeFormatter.ISO_TIME);
		formatters.add(DateTimeFormatter.ISO_DATE);
		formatters.add(DateTimeFormatter.ISO_DATE_TIME);
		formatters.add(DateTimeFormatter.ISO_ORDINAL_DATE);
		formatters.add(DateTimeFormatter.ISO_WEEK_DATE);
		
		LocalDateTime ldt = LocalDateTime.now();
		
		formatters.stream().forEach(f -> {
			System.out.println(ldt.format(f));
		});
	}
}