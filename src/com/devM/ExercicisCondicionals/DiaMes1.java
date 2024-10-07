package com.devM.ExercicisCondicionals;

import java.util.Scanner;


public class DiaMes1 {

	public static void main(String[] args) {

		Scanner diaSemanaInput = new Scanner(System.in);
		Scanner diaMesInput = new Scanner(System.in);
		Scanner mesInput = new Scanner(System.in);

		int diaSemana = 0;
		int diaMes = 0;
		int mes = 0;
		boolean diaSemanaInputBoo = false;
		boolean diaMesBoo = false;

		String nomDia = "";
		String nomMes = "";

		System.out.print("Introduïx un dia de la setmana entre 1 i 7: ");

		if (diaSemanaInput.hasNextInt()) {
			diaSemana = diaSemanaInput.nextInt();
			if (diaSemana >= 1 && diaSemana <= 7) {

				diaSemanaInputBoo = true;
			} else {

				System.out.println("Entrada no vàlida.");
			}
		} else {

			System.out.println("Entrada no vàlida.");
		}

		
		if (diaSemanaInputBoo) {
			System.out.print("Introduïx un dia del mes entre 1 i 31: ");
			if (diaMesInput.hasNextInt()) {
				diaMes = diaMesInput.nextInt();
				if (diaMes >= 1 && diaMes <= 31) {

					diaMesBoo = true;
				} else {

					System.out.println("Entrada no vàlida.");
				}
			} else {

				System.out.println("Entrada no vàlida.");
			}
		}

		
		if (diaMesBoo) {
			System.out.print("Introduïx un mes entre 1 i 12: ");
			if (mesInput.hasNextInt()) {
				mes = mesInput.nextInt();
				if (mes >= 1 && mes <= 12) {
					switch (diaSemana) {
					case 1:
						nomDia = "Dilluns";
						break;
					case 2:
						nomDia = "Dimarts";
						break;
					case 3:
						nomDia = "Dimecres";
						break;
					case 4:
						nomDia = "Dijous";
						break;
					case 5:
						nomDia = "Divendres";
						break;
					case 6:
						nomDia = "Dissabte";
						break;
					case 7:
						nomDia = "Diumenge";
						break;
					}

					switch (mes) {
					case 1:
						nomMes = "gener";
						break;
					case 2:
						nomMes = "febrer";
						break;
					case 3:
						nomMes = "març";
						break;
					case 4:
						nomMes = "abril";
						break;
					case 5:
						nomMes = "maig";
						break;
					case 6:
						nomMes = "juny";
						break;
					case 7:
						nomMes = "juliol";
						break;
					case 8:
						nomMes = "agost";
						break;
					case 9:
						nomMes = "setembre";
						break;
					case 10:
						nomMes = "octubre";
						break;
					case 11:
						nomMes = "novembre";
						break;
					case 12:
						nomMes = "desembre";
						break;
					}

					if (nomMes == "octubre" || nomMes == "agost" || nomMes == "abril") {

						System.out.println("\n" + nomDia + ", " + diaMes + " d'" + nomMes +".");

					} else {
						System.out.println("\n" +nomDia + ", " + diaMes + " de " + nomMes+".");
					}

				} else {

					System.out.println("Entrada no vàlida.");

				}

			} else {

				System.out.println("Entrada no vàlida.");

			}
		}
		diaSemanaInput.close();
		diaMesInput.close();
		mesInput.close();
	}

}
