package com.db1.db1start;

public class LetrasNome {
	
	public String parteDoNome() {
	String nome = "Gabriel da Silva Beraldo";
	int index = nome.indexOf("Gabr");
	String resultado = nome.substring(0, 4);
	return resultado;
		}
	}
