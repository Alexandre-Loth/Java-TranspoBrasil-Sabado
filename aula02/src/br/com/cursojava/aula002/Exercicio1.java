package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nota 1:");
		Float nota1 = Float.parseFloat(teclado.nextLine());
		System.out.println("Nota 2:");
		Float nota2 = Float.parseFloat(teclado.nextLine());
		System.out.println("Nota 3:");
		Float nota3 = Float.parseFloat(teclado.nextLine());
		System.out.printf("Media %f + %f + %f = %f", nota1, nota2, nota3, (nota1+nota2+nota3)/3);
		teclado.close();
	}
}
