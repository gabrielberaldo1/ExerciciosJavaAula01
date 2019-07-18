package com.db1.db1start;

public class App {
	
	public static void main(String[]args) {
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("Gabriel Silva");
		
		
		Calculadora calculadora = new Calculadora(10, 15);
				
		System.out.println(calculadora.somar());
		System.out.println(calculadora.subtrair());
	}
}
