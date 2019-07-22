package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class MaiusculoTest {
	
	@Test
	
	public void deixarMaiusculo() {
		Maiusculo deixarMaiusculo = new Maiusculo();
		String maiusculo = deixarMaiusculo.deixarMaiusculo();
		Assert.assertEquals("TUDO BEM", maiusculo);
	}
	

}
