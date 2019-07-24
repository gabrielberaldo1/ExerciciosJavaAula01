package ExerciciosLista;

import java.util.ArrayList;

import java.util.List;

public class Ex6 {
	public List<String> cor(){
		List<String> cores = new ArrayList<String>();
		cores.add("Vermelho");
		cores.add("Preto");
		cores.add("Azul");
		cores.removeIf(preto -> preto.equals("Preto"));
		return cores;
	}
}
