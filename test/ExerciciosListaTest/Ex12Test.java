package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex12;

public class Ex12Test {
	
	@Test
	public void deveRetornarMenorValor() {
		Ex12 menorv = new Ex12();
		int menor = menorv.valores();
		Assert.assertEquals(1, menor);
		
	}

}
