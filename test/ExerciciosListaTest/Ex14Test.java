package ExerciciosListaTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex14;

public class Ex14Test {
	
	@Test
	public void deveRemoverImpares() {
		Ex14 remoim = new Ex14();
		List<Integer> remover = remoim.impar();
		Assert.assertTrue(0 == remover.get(0));
		Assert.assertTrue(2 == remover.get(1));
		Assert.assertTrue(4 == remover.get(2));
		Assert.assertTrue(6 == remover.get(3));
		Assert.assertTrue(8 == remover.get(4));
		Assert.assertTrue(10 == remover.get(5));
		
	}
	

}
