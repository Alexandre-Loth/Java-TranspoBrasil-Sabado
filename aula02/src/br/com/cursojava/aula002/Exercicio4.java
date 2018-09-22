package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Peso:");
		Float peso = Float.parseFloat(teclado.nextLine());
		System.out.println("Altura:");
		Float altura = Float.parseFloat(teclado.nextLine());
		System.out.printf("%f / %f * %f = %f", peso,altura,altura,peso/(altura * altura));
		teclado.close();
	}
}
