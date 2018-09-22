package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExercicioIF2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nota1:");
		Double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Nota2");
		Double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Nota3:");
		Double nota3 = Double.parseDouble(teclado.nextLine());
		System.out.println("Nota4:");
		Double nota4 = Double.parseDouble(teclado.nextLine());
		
		Double media = (nota1+nota2+nota3+nota4)/4;
		
		if (media>= 9) {
			System.out.println("A");
		}
		else if(media<9 && media>=8) {
			System.out.println("B");
		}
		else if (media<8 && media>=6) {
			System.out.println("C");
		}
		else if (media<6 && media >=5) {
			System.out.println("D");
		}
		teclado.close();
	}
}
