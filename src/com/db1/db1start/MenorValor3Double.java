package com.db1.db1start;

public class MenorValor3Double {
	
	public double menordouble3() {
		double numero1 = 2000;
		double numero2 = 10000;
		double numero3 = 1000;
	if (numero1 > numero3 & numero1 < numero2) {
		return numero3;
	}
	else if (numero1 > numero2 & numero1 > numero3 & numero2 < numero3) {
		return numero2;
	}
	else if (numero1 < numero2 & numero1 < numero3) {	
		return numero1;
	}
	else if (numero1 < numero3 & numero1 > numero2 & numero2 < numero3) {
		return numero2;
	}
	return numero3;
}
		
	}
