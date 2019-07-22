package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class MenorValor3DoubleTest {
	
	@Test
	
	public void verificarMenorValor3Double() {
		MenorValor3Double menor = new MenorValor3Double();
		Double menorv = menor.menordouble3();
		Assert.assertEquals(1000, menorv, 0.01);
		
				
	}

}
