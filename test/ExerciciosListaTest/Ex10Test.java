package ExerciciosListaTest;

import org.junit.Assert;

import org.junit.Test;

import ExerciciosLista.Ex10;

public class Ex10Test {

	@Test
	
	public void deveSomarLista() {
		Ex10 somar = new Ex10();
		int soma = somar.lista();
		Assert.assertEquals(20, soma);
	}
}
