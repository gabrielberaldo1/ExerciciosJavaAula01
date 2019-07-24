package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
	
	public List<List<Integer>> numero() {
	List<Integer> numeros = new ArrayList<Integer>();
	List<Integer> numerospar = new ArrayList<>();
	List<Integer> numerosimpar = new ArrayList<>();
	List<List<Integer>> resultado = new ArrayList<List<Integer>>();
	numeros.add(1);
	numeros.add(2);
	numeros.add(3);
	numeros.add(4);
	for(int i: numeros) {
		if(i % 2 == 0) numerospar.add(i);
		else numerosimpar.add(i);
	};
	resultado.add(numerospar);
	resultado.add(numerosimpar);
	return resultado;
	
	}
}
