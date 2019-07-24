package ExerciciosListaTest;

import ExerciciosLista.Ex8;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Ex8Test {
	
	@Test
	public void deveSepararParEImpar() {
		Ex8 listas = new Ex8();
		List<List<Integer>> resultado = listas.numero();
		Assert.assertTrue(2 == resultado.get(0).get(0));
		Assert.assertTrue(4 == resultado.get(0).get(1));
		Assert.assertTrue(1 == resultado.get(1).get(0));
		Assert.assertTrue(3 == resultado.get(1).get(1));
	}
}