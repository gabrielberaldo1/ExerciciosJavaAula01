package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex1;

public class Ex1Test {
	
	@Test
	
	public void deveRetornarCoresFavoritas() {
		Ex1 cores = new Ex1();
		List<String> cor = cores.cor();
		Assert.assertTrue(cor.contains("Vermelho"));
		Assert.assertTrue(cor.contains("Azul"));
		Assert.assertTrue(cor.contains("Preto"));
	
		
	}

}
