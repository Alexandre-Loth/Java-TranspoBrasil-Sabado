package br.com.cursojava.aula002;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Idade em dias:");
		Integer idade = Integer.parseInt(teclado.nextLine());
		System.out.printf("Anos: %d = %d \n",idade,idade/360);
		System.out.printf("Meses: %d = %d \n ",idade,(idade/12)/30);
		System.out.printf("Dias: %d = %d ",idade,((idade/30)));
		teclado.close();
		
	}
}
