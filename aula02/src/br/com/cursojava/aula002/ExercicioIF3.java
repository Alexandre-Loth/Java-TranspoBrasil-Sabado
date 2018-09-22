package br.com.cursojava.aula002;

import java.awt.Dialog.ModalExclusionType;
import java.util.Scanner;

public class ExercicioIF3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero:");
		Integer numero = Integer.parseInt(teclado.nextLine());
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		teclado.close();
	}
}
