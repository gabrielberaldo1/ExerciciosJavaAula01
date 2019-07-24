package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex5;

public class Ex5Test {
	
	@Test
	public void deveOrdenarAsCores() {
		Ex5 ordenar = new Ex5();
	List<String> ordemc = ordenar.ordem();
	Assert.assertEquals("Azul", ordemc.get(0));
	Assert.assertEquals("Preto", ordemc.get(1));
	Assert.assertEquals("Vermelho", ordemc.get(2));
	
	}

}
