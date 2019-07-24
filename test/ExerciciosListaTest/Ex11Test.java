package ExerciciosListaTest;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex11;

public class Ex11Test {
	
	@Test
	public void deveRetornarAMedia() {
	Ex11 median = new Ex11();
	double media = median.lista();
	Assert.assertEquals(5, media, 0.01);
	}
}
