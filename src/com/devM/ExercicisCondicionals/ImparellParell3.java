package com.devM.ExercicisCondicionals;

import java.util.Scanner;

public class ImparellParell3 {

	public static void main(String[] args) {

		Scanner numInput = new Scanner(System.in);
		int num = 0;
		boolean esEnter = false;

		// Entrada de número per teclat i comprovació
		System.out.print("Introduïx un nombre enter positiu: ");
		if (numInput.hasNextInt()) {
			num = numInput.nextInt();
			if (num >= 0) {
				esEnter = true;
			} else {
				System.out.println("Entrada no vàlida");
			}
		} else {
			System.out.println("Entrada no vàlida");
		}

		if (esEnter) {
			// Es parell o imparell
			if (num % 2 == 0) {
				System.out.println("\n+----------------------------------------+");
				System.out.println("     El número " + num + " és parell");
				System.out.println("+----------------------------------------+");
			} else {
				System.out.println("+----------------------------------------+");
				System.out.println("     El número " + num + " és imparell");
				System.out.println("+----------------------------------------+");
			}

			// Multiple de 3
			if (num % 3 == 0) {
				System.out.println("+----------------------------------------+");
				System.out.println("     El número " + num + " és múltiple de 3");
				System.out.println("+----------------------------------------+");
			} else {
				System.out.println("+----------------------------------------+");
				System.out.println("     El número " + num + " no és múltiple de 3");
				System.out.println("+----------------------------------------+");

			}

			// Multiple de 5
			if (num % 5 == 0) {
				System.out.println("+----------------------------------------+");
				System.out.println("     El número " + num + " és múltiple de 5");
				System.out.println("+----------------------------------------+");
			} else {
				System.out.println("+----------------------------------------+");
				System.out.println("     El número " + num + " no és múltiple de 5");
				System.out.println("+----------------------------------------+");

			}

		}
		numInput.close();
	}

}
