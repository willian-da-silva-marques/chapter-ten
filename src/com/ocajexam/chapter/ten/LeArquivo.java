package com.ocajexam.chapter.ten;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class LeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "arquivu.txt";
		lerArquivoDeTexto(fileName);
//		try {
//		} catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("?");
	}

	private static void lerArquivoDeTexto(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName), StandardCharsets.UTF_8.name());
		Scanner scannerLine = null;
		while (scanner.hasNext()) {
			String stringLine = scanner.nextLine();
			scannerLine = new Scanner(stringLine);
			scannerLine.useLocale(new Locale("pt", "BR"));
			String nextLine = scannerLine.nextLine();
			System.out.println(nextLine);
		}
		scannerLine.close();
		scanner.close();
	}
}