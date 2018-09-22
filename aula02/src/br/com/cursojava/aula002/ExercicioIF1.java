package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExercicioIF1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nota1:");
		Double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Nota2");
		Double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Nota3:");
		Double nota3 = Double.parseDouble(teclado.nextLine());
		
		Double media = (nota1+nota2+nota3)/3;
		
		if (media>=7) {
			System.out.println("Aprovado");
		}	else {
			System.out.println("Reprovado");
		}
		teclado.close();
	}
}
