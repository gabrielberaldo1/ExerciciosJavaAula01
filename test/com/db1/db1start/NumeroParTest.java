package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class NumeroParTest {
	
	@Test
	public void deveVerificarPar() {
		NumeroPar par = new NumeroPar();
		boolean verpar = par.numero();
		Assert.assertEquals(true, verpar);	
	}

}
