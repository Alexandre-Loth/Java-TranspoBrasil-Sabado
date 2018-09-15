package br.com.cursojava.aula01;

public class Exercicio11 {

	public static void main(String[] args) {
		int a = 10; 
		int b = 7;
		int c = 20;
		int d = 30;
		int e = 0;
		int f = 0;
		
		e = Math.min(a, b);
		f = Math.min(c, d);
		System.out.println("O menor numero é: "+Math.min(e, f));
	}
}
