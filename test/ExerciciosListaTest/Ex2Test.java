package ExerciciosListaTest;

import org.junit.Assert;

import org.junit.Test;

import ExerciciosLista.Ex2;

public class Ex2Test {
	
	@Test
	
	public void deveRetornarAQuantidade() {
		Ex2 qtd = new Ex2();
		int lista = qtd.quantidadeLista();
		Assert.assertEquals(4, lista);
	}

}
