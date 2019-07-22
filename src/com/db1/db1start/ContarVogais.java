package com.db1.db1start;

public class ContarVogais {	

	public int vogais() {
		String texto = "Parabens";
		int contarVogais = 0;
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
		}
		return contarVogais;
	}
}
