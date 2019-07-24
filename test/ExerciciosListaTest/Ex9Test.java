package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex9;

public class Ex9Test {
	
	@Test
	public void deveSepararEOrdenar() {
		Ex9 ordenar = new Ex9();
	List<String> separados = ordenar.lista();
	Assert.assertEquals("ANA", separados.get(0));
	Assert.assertEquals("ANA LAURA", separados.get(1));
	Assert.assertEquals("CLECIO", separados.get(2));
	Assert.assertEquals("JOALDO", separados.get(3));
	Assert.assertEquals("JOSE", separados.get(4));
	Assert.assertEquals("JOSÉ", separados.get(5));
	Assert.assertEquals("JOSÉ", separados.get(6));
	Assert.assertEquals("MARCOS", separados.get(7));
	Assert.assertEquals("MARIA", separados.get(8));
	Assert.assertEquals("ROBERVAL", separados.get(9));
	Assert.assertEquals("RODOLFO", separados.get(10));
	Assert.assertEquals("RODOLPHO", separados.get(11));
	Assert.assertEquals("VAGNER", separados.get(12));
	Assert.assertEquals("WAGNER", separados.get(13));
	
	
	}

}
