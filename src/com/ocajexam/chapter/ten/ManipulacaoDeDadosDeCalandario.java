package com.ocajexam.chapter.ten;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ManipulacaoDeDadosDeCalandario {

	public static void main(String[] args) {

		// Há 16 métodos plus/minus aplicáveis a classe LocalDateTime.
		LocalDateTime ldt = LocalDateTime.now();
		
		// Todos os métodos plus
		ldt = ldt.plusYears(1)
				.plusMonths(12)
				.plusWeeks(52)
				.plusDays(365)
				.plusHours(8765)
				.plusMinutes(525949)
				.plusSeconds(0)
				.plusNanos(0);
		
		// Todos os métodos minus
		ldt = ldt.minusYears(1)
				.minusMonths(12)
				.minusWeeks(52)
				.minusDays(365)
				.minusHours(8765)
				.minusMinutes(525949)
				.minusSeconds(0)
				.minusNanos(0);

		// Há 8 métodos plus/minus aplicáveis a classe LocalDate.
		LocalDate ld = LocalDate.now();
		
		// Todos os métodos plus
		ld = ld.plusYears(1)
				.plusMonths(12)
				.plusWeeks(52)
				.plusDays(365);
		
		// Todos os métodos minus
		ld = ld.minusYears(1)
				.minusMonths(12)
				.minusWeeks(52)
				.minusDays(365);

		// Há 8 métodos plus/minus aplicáveis a classe LocalTime.
		LocalTime lt = LocalTime.now();
		
		// Todos os métodos plus
		lt = lt.plusHours(8765)
				.plusMinutes(525949)
				.plusSeconds(0)
				.plusNanos(0);
		
		// Todos os métodos minus
		lt = lt.minusHours(8765)
				.minusMinutes(525949)
				.minusSeconds(0)
				.minusNanos(0);
	}
}
