package ExerciciosListaTest;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex13;

public class Ex13Test {
	@Test
	public void deveRetornarMaiorValor() {
		Ex13 maiorv = new Ex13();
		int maior = maiorv.valores();
		Assert.assertEquals(15, maior);
		
	}

}

