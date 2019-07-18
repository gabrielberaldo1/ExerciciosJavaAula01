package com.db1.db1start;

public class Matematica2 {
		
	public static void main(String[]args) {
		
		
		double numero1 = 200;
		double numero2 = 100;
		double numero3 = 1000;
	if (numero1 > numero3 & numero1 < numero2) {
		System.out.println("O menor valor entre os três é o: " + numero3);
	}
	if (numero1 > numero2 & numero1 > numero3 & numero2 < numero3) {
		System.out.println("O menor valor entre os três é o: " + numero2);
	}
	if (numero1 < numero2 & numero1 < numero3) {	
		System.out.println("O menor valor entre os três é o: " + numero1);
	}
	if (numero1 < numero3 & numero1 > numero2 & numero2 < numero3) {
		System.out.println("O menor valor entre os três é o:" + numero2 );
	}
		
		}
}		