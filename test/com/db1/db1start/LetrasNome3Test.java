package com.db1.db1start;

import org.junit.Test;



import org.junit.Assert;

public class LetrasNome3Test {
	
	@Test
	
	public void exibirLetras3() {
		LetrasNome3 letras = new LetrasNome3();
		String letras3 = letras.letras3();
	Assert.assertEquals("riel da Silva Beraldo", letras3);
		
	}

}
