package ExerciciosListaTest;

import java.util.List;




import org.junit.Assert;
import org.junit.Test;
import ExerciciosLista.Ex6;

public class Ex6Test {

	@Test
	public void deveRetornarCoresFavoritas() {
		Ex6 remover = new Ex6();
		List<String> removerc = remover.cor();
		Assert.assertEquals("Vermelho", removerc.get(0));
		Assert.assertEquals("Azul", removerc.get(1));
	
		
	}
	
}
