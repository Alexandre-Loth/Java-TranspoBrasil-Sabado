package br.com.cursojava.aula01;

public class Exercicio12 {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int c = 25;
		int d = 10;
		int e = 0;
		int f = 0;
		
		e = Math.max(a, b);
		f = Math.max(c, d);
		
		System.out.println("O maior numero é: "+Math.max(e, f));
	}
}
