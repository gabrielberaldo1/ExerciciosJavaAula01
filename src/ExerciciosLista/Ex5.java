package ExerciciosLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex5 {
	
	public List<String> ordem () {
		List<String> ocores = new ArrayList<String>();
		ocores.add("Vermelho");
		ocores.add("Azul");
		ocores.add("Preto");
		Collections.sort(ocores);
		return ocores;
		}
	}