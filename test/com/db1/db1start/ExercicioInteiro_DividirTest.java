package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioInteiro_DividirTest {
	@Test
	public void deveDividirDoisValores() {
		ExercicioInteiro_Dividir exerciciodividir = new ExercicioInteiro_Dividir();
		int dividir = exerciciodividir.dividir(4, 2);
		Assert.assertEquals(2, dividir);
	}
}
