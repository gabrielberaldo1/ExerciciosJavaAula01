package com.db1.db1start;

public class InverterTexto {
	
	public String inverter() {
	String texto = "Tudo bem";
	String textoinvertido = new StringBuilder(texto).reverse().toString();
	return textoinvertido;
	}

}
