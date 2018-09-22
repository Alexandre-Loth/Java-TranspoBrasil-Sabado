package br.com.cursojava.aula002;

public class Wapper {
	public static void main(String[] args) {
		//Pre java 5
		int numero = 10;
		Integer wrapper = new Integer(numero);
		int num = wrapper.intValue();
		num++;
		wrapper = new Integer(num);
		//Pos java 5
		int numero2 = 10;
		Integer wrapper2 = numero2;
		wrapper2++;
	}
}
