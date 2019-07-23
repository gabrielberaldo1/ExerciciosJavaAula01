package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
	
	public int lista(){
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(6);
		numeros.add(8);
		int soma = 0;
		for (int i = 0; i < numeros.size();) {
		soma += numeros.get(i);
		
		}
		return soma;
		
		

}
}
