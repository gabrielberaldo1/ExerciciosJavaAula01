package com.db1.db1start;

import org.junit.Test;


import org.junit.Assert;

public class LetrasNome4UltimaTest {
	
	@Test
	
	public void exibirLetras4ultima() {
		LetrasNome4Ultima letras = new LetrasNome4Ultima();
		String letras4 = letras.letras4ultima();
	Assert.assertEquals("aldo", letras4);
		
	}

}
