package com.db1.db1start;

public class ContarVogais {	
	public int vogais() {
	String texto = "Ola tudo bem";
	int contador = 0;
	for (int i = 0; i < texto.length();){
	char c = texto.charAt(i);	
	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	 contador++;
			}	
		}
	return contador;
	}

}
