package com.db1.db1start;

public class Calculadora {
	
	private int numero1;
	
	private int numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int somar() {
		return numero1 + numero2;
	}
	
		public int subtrair() {
			return numero1 - numero2;
			
		}
}
