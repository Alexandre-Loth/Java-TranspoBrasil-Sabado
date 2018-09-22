package br.com.cursojava.aula002;

import java.util.Scanner;

import javax.security.sasl.SaslClient;
import javax.xml.transform.Templates;

public class ExercicioIF6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Verificar Saldo");
		Integer opcao = Integer.parseInt(teclado.nextLine());
		
		if (opcao == 1) {
			System.out.println("Depositar");
		} 
		else if (opcao == 2) {
			System.out.println("Sacar");
		} 
		else if (opcao == 3) {
			System.out.println("Verificar saldo");
		}
	}
}
