package ExerciciosListaTest;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

import ExerciciosLista.Ex3;

public class Ex3Test {
	
	@Test
	
	public void deveRetornarUmaLista() {
		Ex3 texto = new Ex3();
		List<String> lista = texto.lista();
		Assert.assertTrue(lista.contains("José"));
		Assert.assertTrue(lista.contains("Maria"));
		
		
	}

}
