package com.ocajexam.chapter.ten;

import java.time.LocalDateTime;

public class TestLocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.plusDays(3));
		System.out.println(localDateTime.toLocalDate().plusDays(3));
		System.out.println(localDateTime.toLocalTime());
	}

}
