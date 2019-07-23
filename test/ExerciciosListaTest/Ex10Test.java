package ExerciciosListaTest;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex10;

public class Ex10Test {

	@Test
	
	public void deveSomarLista() {
		Ex10 soma = new Ex10();
		int somar = soma.lista();
		Assert.assertEquals(19, somar);
		
		
		
	}
}
