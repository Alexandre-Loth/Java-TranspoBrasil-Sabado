package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Produto:");
		Float preco = Float.parseFloat(teclado.nextLine());
		System.out.println("Desconto:");
		Float desconto = Float.parseFloat(teclado.nextLine());
		System.out.printf("Desconto %f * %f = %f \n",preco,desconto, (preco * desconto)/100);
		System.out.printf("Produto %f * %f - %f = %f",preco,desconto,preco,(preco - (preco * desconto)/100));
		teclado.close();
	}
}
