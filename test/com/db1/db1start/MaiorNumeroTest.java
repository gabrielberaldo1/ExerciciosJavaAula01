package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class MaiorNumeroTest {
	
	
	@Test
	public void verificarSeEPar() {
		MaiorNumero vermaior = new MaiorNumero();
		int maior = vermaior.maior(10, 5);
		Assert.assertEquals(10, maior);
		
	}

}
