package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;

public class Impar100Test {
	
	@Test
	public void deveSomarImparAte100() {
		Impar100 impar = new Impar100();
		int verimpar = impar.impares(0, 0);
		Assert.assertEquals(50, verimpar);
	}
	

}
