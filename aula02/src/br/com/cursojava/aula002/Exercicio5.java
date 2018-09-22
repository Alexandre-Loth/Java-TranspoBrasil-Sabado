package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Idade:");
		Integer idade = Integer.parseInt(teclado.nextLine());
		System.out.printf("%d = %d", idade,idade*365);
		teclado.close();
	}
}
