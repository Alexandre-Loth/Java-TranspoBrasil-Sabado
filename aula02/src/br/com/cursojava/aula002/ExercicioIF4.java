package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExercicioIF4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Idade:");
		Integer idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18) {
			System.out.println("Adulto");
		} 
		else if(idade < 18 && idade>=14) {
			System.out.println("Juvenil");
		} 
		else if (idade < 14 && idade>=12) {
			System.out.println("Infanto Juvenil");
		} 
		else if (idade < 12 && idade >=9) {
			System.out.println("Infantil");
		}
		else if (idade < 9) {
			System.out.println("Mirin");
		}
		teclado.close();
	}
}
