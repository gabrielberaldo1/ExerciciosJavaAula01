package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex15;

public class Ex15Test {
	
	@Test
	
	public void deveRetornarListaVogais() {
		Ex15 vog = new Ex15();
		List<String>vogais = vog.texto();
		Assert.assertEquals("a", vogais.get(0));
		Assert.assertEquals("a", vogais.get(1));
		Assert.assertEquals("e", vogais.get(2));
	}

}
