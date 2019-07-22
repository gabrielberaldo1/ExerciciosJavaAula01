package com.db1.db1start;

import org.junit.Test;

import org.junit.Assert;


public class ContarLetrasTest {
	
	@Test
	
	public void deveContarLetras() {
		ContarLetras letras = new ContarLetras();
		int contar = letras.contarletras();
		Assert.assertEquals(8, contar);
	}

}
