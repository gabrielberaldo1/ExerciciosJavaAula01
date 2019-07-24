package ExerciciosLista;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Ex9 {
	
	public List<String>lista() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("ANA");
		nomes.add("ANA LAURA");
		nomes.add("JOSE");
		nomes.add("WAGNER");
		nomes.add("RODOLFO");
		nomes.add("ROBERVAL");
		nomes.add("RODOLPHO");
		nomes.add("VAGNER");
		nomes.add("JOSÉ");
		nomes.add("JOALDO");
		nomes.add("CLECIO");
		nomes.add("JOSÉ");
		nomes.add("MARIA");
		nomes.add("MARCOS");
		Collections.sort(nomes);
		return nomes;
	}

}
