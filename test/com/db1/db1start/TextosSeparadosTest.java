package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class TextosSeparadosTest {

	@Test
	
	public void textoseparado() {
		TextosSeparados separado = new TextosSeparados();
		String separar = separado.separado();
	Assert.assertEquals("banana" + "\n" + "Maçã" + "\n" + "Melancia", separar);
	}
	
}
