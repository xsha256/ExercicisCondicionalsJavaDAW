package com.devM.ExercicisCondicionals;

import java.util.Scanner;

public class Edat6 {

	public static void main(String[] args) {

		Scanner edatInput = new Scanner(System.in);
		Scanner sexeInput = new Scanner(System.in);

		int edat = 0;
		String sexeString = "";
		char sexeCaracter = ' ';
		boolean valido = false;

		System.out.print("Introduïx la teua edat: ");
		if (edatInput.hasNextInt()) {
			edat = edatInput.nextInt();
			if (edat > 0) {
				valido = true;

			} else {
				System.out.println("Edat no vàlida");
			}

		} else {
			System.out.println("Entrada no vàlido");
		}

		if (valido) {
			System.out.print("introduïx el teu sexe('H' per a home i 'D' per a dona): ");
			sexeString = sexeInput.next();
			if (sexeString.length() == 1) {
				sexeCaracter = sexeString.charAt(0);
				if (edat <= 18) {

					switch (Character.toUpperCase(sexeCaracter)) {
					case 'H' -> System.out.println("Hola xaval, com estàs?, encara ets molt jove");
					case 'D' -> System.out.println("Hola joveneta, què tal et trobes?");
					default -> System.out.println("Lletra no vàlida");

					}
				} else {
					switch (Character.toUpperCase(sexeCaracter)) {
					case 'H' -> System.out.println("Vostè ja pot votar, senyor");
					case 'D' -> System.out.println("Vostè ja pot votar, senyora");
					default -> System.out.println("Lletra no vàlida");

					}
				}
			} else {
				System.out.println("Entrada no vàlido");
			}
		}
		edatInput.close();
		sexeInput.close();
		
	}

}
