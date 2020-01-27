package com.ocajexam.chapter.ten;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class Main {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
//		naoTenhoTratamento();
//		System.out.println("Nem vou aparecer!");
		
		tenhoTratamento();
		System.out.println("Vou aparecer!");
	}

//	private static void naoTenhoTratamento() {
//		String string = "oi";
//		string.charAt(2);
//	}
	
	private static void tenhoTratamento() {
		String[] string = new String[2];
		try {
			int i = 0;
			for (; i < string.length; i++) {
				System.out.println(i);
			}
			String s = string[i];
			System.out.printf("%2s%n", s);
		} catch (IndexOutOfBoundsException e) {
			LOGGER.error(e.getMessage());
		}
	}
}