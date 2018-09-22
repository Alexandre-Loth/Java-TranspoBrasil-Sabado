package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nota1:");
		Float nota1 = Float.parseFloat(teclado.nextLine());
		System.out.println("Nota2:");
		Float nota2 = Float.parseFloat(teclado.nextLine());
		System.out.println("Nota3:");
		Float nota3 = Float.parseFloat(teclado.nextLine());
		
		Float m = Math.max(nota1, nota2);
		Float maior = Math.max(m, nota3);
		
		Float me = Math.min(nota1, nota2);
		Float menor = Math.min(me, nota3);
		
		System.out.printf("Max %f \n",maior);
		System.out.printf("Min %f",menor);
		teclado.close();
	}
}
