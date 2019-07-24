package ExerciciosListaTest;

import java.util.List;



import org.junit.Assert;
import org.junit.Test;

import ExerciciosLista.Ex3;

public class Ex3Test {
	
	@Test
	public void deveRemoverOSegundoDaLista() {
		Ex3 remover = new Ex3();
		List<String> nomes = remover.lista();
		Assert.assertEquals("José", nomes.get(0));
		Assert.assertEquals("Maria", nomes.get(1));
	
	
		
	}
}
