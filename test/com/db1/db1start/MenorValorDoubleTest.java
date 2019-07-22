package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class MenorValorDoubleTest {
	
	@Test
	
	public void verificarMenorValor2Double() {
		MenorValorDouble menor = new MenorValorDouble();
		Double menorv = menor.menordouble();
		Assert.assertEquals(5, menorv, 0.01);
		
				
	}

}
