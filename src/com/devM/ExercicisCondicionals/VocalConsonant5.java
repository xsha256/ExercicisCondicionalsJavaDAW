package com.devM.ExercicisCondicionals;

import java.util.Scanner;

public class VocalConsonant5 {

	public static void main(String[] args) {

		Scanner charInput = new Scanner(System.in);
		String cadena = "";
		char caracter = ' ';

		System.out.print(" Introduïx una lletra de l'alfabet: ");

		cadena = charInput.next();

		if (cadena.length() == 1) {
			caracter = cadena.charAt(0);
			switch (Character.toLowerCase(caracter)) {
			case 'a', 'e', 'i', 'o', 'u' -> System.out.println(
					"Has introduït una lletra de l'alfabet i és una vocal: " + Character.toLowerCase(caracter));
			case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
					'z', 'y' ->
				System.out.println(
						"Has introduït una lletra de l'alfabet i és una consonant: " + Character.toLowerCase(caracter));
			default -> System.out.println("No has introduït una lletra de l'alfabet");
			}
		} else {
			System.out.println("No has introduït un caràcter");
		}

		charInput.close();

	}

}
