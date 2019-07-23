package ExerciciosLista;

import java.util.ArrayList;
//errado

import java.util.List;

public class Ex6 {
	public List<String> cor(){
		List<String> cores = new ArrayList<String>();
		List<String> remover = new ArrayList<String>();
		cores.add("Vermelho");
		cores.add("Azul");
		cores.add("Preto");
		remover.removeIf(a -> a.equals("Preto"));
		return cores;
	}
}
