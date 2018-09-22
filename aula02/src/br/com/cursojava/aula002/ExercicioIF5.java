package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExercicioIF5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Salario:");
		Double salario = Double.parseDouble(teclado.nextLine());
		
		Double salarioDesconto = salario - ((salario * 11)/100);
		
		if (salarioDesconto > 1800 && salarioDesconto <= 2400 ) {
			System.out.printf("Salario inicial:    %f \n",salario);
			System.out.printf("Desconto INSS:      %f \n",(salario * 11)/100);
			System.out.printf("Desconto I.R. 7,5: %f \n",(salarioDesconto * 7.5)/100);
			System.out.printf("Salario liquido:    %f \n",salarioDesconto-((salarioDesconto * 7.5)/100));
		} 
		else if (salarioDesconto > 2400 && salarioDesconto <= 3600) {
			System.out.printf("Salario total: %f",salarioDesconto - ((salarioDesconto * 24)/100));
		} 
		else if (salarioDesconto > 3600) {
			System.out.printf("Salario total: %f",salarioDesconto - ((salarioDesconto * 32)/100));
		}
	teclado.close();
	}
}
