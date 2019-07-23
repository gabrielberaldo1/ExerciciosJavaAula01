package ExerciciosLista;

import java.util.ArrayList;

import java.util.List;

public class Ex6 {
	public List<String> cor(){
		List<String> cores = new ArrayList<String>();
		List<String> remover = new ArrayList<String>();
		cores.add("Vermelho");
		cores.add("Azul");
		cores.add("Preto");
		cores.removeIf(preto -> preto.equals("Preto"));
		return cores;
	}
}
