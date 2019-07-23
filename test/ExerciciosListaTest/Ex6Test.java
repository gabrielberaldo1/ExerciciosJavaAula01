package ExerciciosListaTest;

import java.util.List;




import org.junit.Assert;
import org.junit.Test;
import ExerciciosLista.Ex6;

public class Ex6Test {

	@Test
	
	public void deveRetornarCoresFavoritas() {
		Ex6 cores = new Ex6();
		List<String> cor = cores.cor();
		Assert.assertTrue(cor.contains("Vermelho"));
		Assert.assertTrue(cor.contains("Azul"));
	
		
	}
	
}
