package com.db1.db1start;

import org.junit.Test;


import org.junit.Assert;

public class Ex5StringTest {
	
	
	@Test
	
	public void deveDeixarAFraseQuantidadeIgual() {
		Ex5String igual = new Ex5String();
		int deixarsemespaco = igual.deixarSemEspaco() ;
		Assert.assertEquals(8, deixarsemespaco);
	}
}
