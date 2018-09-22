package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Base:");
		Float base = Float.parseFloat(teclado.nextLine());
		System.out.println("Altura:");
		Float altura = Float.parseFloat(teclado.nextLine());
		System.out.printf("Perimetro %f + %f = %f \n",base,altura, base + base + altura + altura);
		System.out.printf("Area %f * %f = %f",base,altura, base * altura);
		teclado.close();
	}
}
