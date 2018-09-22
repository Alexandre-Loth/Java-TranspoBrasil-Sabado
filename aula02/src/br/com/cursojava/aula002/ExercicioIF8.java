package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExercicioIF8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ano de nascimento:");
		Integer ano = Integer.parseInt(teclado.nextLine());
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("Não é bissexto");
		}
	}
}
