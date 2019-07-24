package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {
	
	public List<Integer> impar() {
		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
            numeros.add(i);
    }
		for (int i = 0; i < numeros.size(); i++) {
		if (numeros.get(i) % 2 != 0){
		numeros.remove(i);
	}
		}
		return numeros;
	}

}
