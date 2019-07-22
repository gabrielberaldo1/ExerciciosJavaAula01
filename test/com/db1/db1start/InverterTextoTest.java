package com.db1.db1start;

import org.junit.Test;

import org.junit.Assert;


public class InverterTextoTest {
	
	@Test
	public void inverter() {
		InverterTexto inverte = new InverterTexto();
		String invertido = inverte.inverter();
	Assert.assertEquals("meb oduT", invertido);
		
		
	}

}
