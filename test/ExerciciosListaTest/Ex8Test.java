package ExerciciosListaTest;

import ExerciciosLista.Ex8; 

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Ex8Test {
	//errado
	
	@Test
	
	public void deveSepararParEImpar() {
		Ex8 listas = new Ex8();
		List<List<Integer>> numero = listas.numero();
		Assert.assertEquals(2,4);
		
	}

}
