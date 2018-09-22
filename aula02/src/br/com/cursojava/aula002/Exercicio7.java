package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor:");
		Integer valor = Integer.parseInt(teclado.nextLine());
		System.out.println("Resultado: "+ Math.pow(valor, 2));
		teclado.close();
	}
}
