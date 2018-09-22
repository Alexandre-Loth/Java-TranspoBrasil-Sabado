package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExercicioIF7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = teclado.nextLine();
		
		if (nome.length() <= 3) {
			System.out.println("Invalido");
		} else {
			System.out.println("Cadastrado com sucesso");
		}
	}
}
