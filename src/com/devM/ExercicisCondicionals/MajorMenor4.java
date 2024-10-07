package com.devM.ExercicisCondicionals;

import java.util.Scanner;


public class MajorMenor4 {

	public static void main(String[] args) {
		Scanner num1Input = new Scanner(System.in);
		Scanner num2Input = new Scanner(System.in);
		Scanner num3Input = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean entradaCorrecta1 = false;
		boolean entradaCorrecta2 = false;

		System.out.print("Introduïx el primer nombre enter: ");
		if (num1Input.hasNextInt()) {
			num1 = num1Input.nextInt();
			entradaCorrecta1 = true;

		} else {
			System.out.println("Entrada no vàlida");
		}

		if (entradaCorrecta1) {
			System.out.print("Introduïx el segon nombre enter: ");
			if (num2Input.hasNextInt()) {
				num2 = num2Input.nextInt();
				entradaCorrecta2 = true;

			} else {
				System.out.println("Entrada no vàlida");
			}
		}

		if (entradaCorrecta2) {
			System.out.print("Introduïx el tercer nombre enter: ");
			if (num3Input.hasNextInt()) {
				num3 = num3Input.nextInt();

				if (num1 < num2 && num1 < num3) {
					System.out.println("\n+------------------------------------------------------------------------+");
					System.out.println(
							"    El menor número dels 3 (" + num1 + ", " + num2 + ", " + num3 + ") és: " + num1);
					System.out.println("+------------------------------------------------------------------------+");
				} else if (num2 < num3 && num2 < num1) {
					System.out.println("\n+------------------------------------------------------------------------+");
					System.out.println(
							"    El menor número dels 3 (" + num1 + ", " + num2 + ", " + num3 + ") és: " + num2);
					System.out.println("+------------------------------------------------------------------------+");
				} else {
					System.out.println("\n+------------------------------------------------------------------------+");
					System.out.println(
							"    El menor número dels 3 (" + num1 + ", " + num2 + ", " + num3 + ") és: " + num3);
					System.out.println("+------------------------------------------------------------------------+");
				}

				if (num1 > num2 && num1 > num3) {
					System.out.println(
							"    El major número dels 3 (" + num1 + ", " + num2 + ", " + num3 + ") és: " + num1);
					System.out.println("+------------------------------------------------------------------------+");
				} else if (num2 > num3 && num2 > num1) {
					System.out.println(
							"    El major número dels 3 (" + num1 + ", " + num2 + ", " + num3 + ") és: " + num2);
					System.out.println("+------------------------------------------------------------------------+");

				} else {
					System.out.println(
							"    El major número dels 3 (" + num1 + ", " + num2 + ", " + num3 + ") és: " + num3);
					System.out.println("+------------------------------------------------------------------------+");

				}
			} else {
				System.out.println("Entrada no vàlida");
			}
		}

		num1Input.close();
		num2Input.close();
		num3Input.close();
	}

}
