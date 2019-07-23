package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class Ex15 {
	
	public List<String> texto() {
	ArrayList<String> vogal = new ArrayList<String>();
	String texto = "Parabens";
	for (int i = 0; i < texto.length(); i++) {
		char c = texto.charAt(i);
        if (c == 'a'){
        	vogal.add("a");
        }
        if (c == 'e'){
            vogal.add("e");
        }
        if (c == 'i'){
            vogal.add("i");
        }
        if (c == 'o'){
            vogal.add("o");
        }
        if (c == 'u'){
            vogal.add("u");
        }
	}
	return vogal;
}
}
