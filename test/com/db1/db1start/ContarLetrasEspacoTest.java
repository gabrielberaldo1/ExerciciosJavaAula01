package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class ContarLetrasEspacoTest {

	@Test
	
	public void deveContarLetras() {
		ContarLetrasEspaco letras = new ContarLetrasEspaco();
		int contar = letras.contarletras();
		Assert.assertEquals(10, contar);
	}
	
}
