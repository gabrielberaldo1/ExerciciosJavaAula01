package ExerciciosLista;

import java.util.List;

import java.util.ArrayList;

public class Ex3 {
	
	public List<String> lista(){
		List<String> textos = new ArrayList<String>();
		textos.add("Jos�");
		textos.add("Jo�o");
		textos.add("Maria");
		
		textos.removeIf(a -> a.equals("Jo�o"));
	return textos;
	}

}
