package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Ex13 {
	
	public Integer valores(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(15);
		numeros.add(7);
		Integer maior = numeros.get(0);
		for (int i: numeros) {
			if (i > maior) {
				maior = i;
			
			}
	
		}
		return maior;
	}

}

