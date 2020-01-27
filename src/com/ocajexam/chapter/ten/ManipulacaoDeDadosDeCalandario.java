package com.ocajexam.chapter.ten;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ManipulacaoDeDadosDeCalandario {

	public static void main(String[] args) {

		// H� 16 m�todos plus/minus aplic�veis a classe LocalDateTime.
		LocalDateTime ldt = LocalDateTime.now();
		
		// Todos os m�todos plus
		ldt = ldt.plusYears(1)
				.plusMonths(12)
				.plusWeeks(52)
				.plusDays(365)
				.plusHours(8765)
				.plusMinutes(525949)
				.plusSeconds(0)
				.plusNanos(0);
		
		// Todos os m�todos minus
		ldt = ldt.minusYears(1)
				.minusMonths(12)
				.minusWeeks(52)
				.minusDays(365)
				.minusHours(8765)
				.minusMinutes(525949)
				.minusSeconds(0)
				.minusNanos(0);

		// H� 8 m�todos plus/minus aplic�veis a classe LocalDate.
		LocalDate ld = LocalDate.now();
		
		// Todos os m�todos plus
		ld = ld.plusYears(1)
				.plusMonths(12)
				.plusWeeks(52)
				.plusDays(365);
		
		// Todos os m�todos minus
		ld = ld.minusYears(1)
				.minusMonths(12)
				.minusWeeks(52)
				.minusDays(365);

		// H� 8 m�todos plus/minus aplic�veis a classe LocalTime.
		LocalTime lt = LocalTime.now();
		
		// Todos os m�todos plus
		lt = lt.plusHours(8765)
				.plusMinutes(525949)
				.plusSeconds(0)
				.plusNanos(0);
		
		// Todos os m�todos minus
		lt = lt.minusHours(8765)
				.minusMinutes(525949)
				.minusSeconds(0)
				.minusNanos(0);
	}
}
