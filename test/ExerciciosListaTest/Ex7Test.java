package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex7;

public class Ex7Test {
	
	@Test
	public void deveRetornarStringEmOrdemDecrescente() {
		Ex7 decrescente = new Ex7();
		List<String> ordenard = decrescente.ordem();
		Assert.assertEquals("Vermelho", ordenard.get(0));
		Assert.assertEquals("Preto", ordenard.get(1));
		Assert.assertEquals("Azul", ordenard.get(2));	
	}		
}
