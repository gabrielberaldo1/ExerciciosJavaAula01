package ExerciciosLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex12 {
	
	public Integer valores(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(15);
		numeros.add(7);
		Collections.sort(numeros);
		return numeros.get(0);
	}

}
