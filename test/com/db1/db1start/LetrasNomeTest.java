package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class LetrasNomeTest {
	
	@Test
	
	public void exibir4LetrasNome() {
		LetrasNome letras = new LetrasNome();
		String letraas = letras.parteDoNome();
	Assert.assertEquals("Gabr", letraas);
		
	}

}
