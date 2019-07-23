package ExerciciosLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13 {
	
	public Integer valores(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(10);
		numeros.add(1);
		Collections.sort(numeros);
		return numeros.get(3);
	}

}
