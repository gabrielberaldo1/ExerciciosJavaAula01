package ExerciciosLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex12 {
	
	public Integer valores(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(15);
		numeros.add(7);
		Integer menor = numeros.get(0);
		for (int i: numeros) {
			if (i < menor) {
				menor = i;
			
			}
	
		}
		return menor;
	}

}
