package ExerciciosLista;

import java.util.List;

import java.util.ArrayList;

public class Ex3 {
	
	public List<String> lista(){
		List<String> textos = new ArrayList<String>();
		textos.add("José");
		textos.add("João");
		textos.add("Maria");
		
		textos.removeIf(a -> a.equals("João"));
	return textos;
	}

}
