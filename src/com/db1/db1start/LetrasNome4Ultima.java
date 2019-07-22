package com.db1.db1start;

public class LetrasNome4Ultima {
	
	public String letras4ultima() {
		String nome = "Gabriel da Silva Beraldo";
		int index = nome.indexOf("aldo");
		String resultado = nome.substring(20);
		return resultado;
			}

}
