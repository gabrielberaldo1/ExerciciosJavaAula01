package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;

public class ContaVogaisTest {	
	@Test
	
	public void deveContarVogais() {
		ContarVogais vogais = new ContarVogais();
		int contarv = vogais.vogais();
		Assert.assertEquals(3, contarv);
	}

}
