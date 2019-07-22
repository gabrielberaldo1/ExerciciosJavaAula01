package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class MinusculoTest {
	
	@Test
	
	public void deixarMinusculo() {
		Minusculo deixarMinusculo = new Minusculo();
		String minusculo = deixarMinusculo.deixarMinusculo();
		Assert.assertEquals("tudo bem", minusculo);
	}

}
