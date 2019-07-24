package ExerciciosLista;

import java.util.ArrayList;

import java.util.List;

public class Ex11 {
	
	public double lista(){
		List<Double> numeros = new ArrayList<>();
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(7.0);
		numeros.add(8.0);
		double media = 0;
		for (int i = 0; i < numeros.size();i++) {
		media += numeros.get(i);
		
		}
		return media / 4;
	}
}
