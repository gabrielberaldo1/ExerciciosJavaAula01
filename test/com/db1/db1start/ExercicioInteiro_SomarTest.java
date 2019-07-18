package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioInteiro_SomarTest {
	
	@Test
	public void deveSomarDoisValores() {
		ExercicioInteiro_Somar exerciciosomar = new ExercicioInteiro_Somar();
		int somar = exerciciosomar.somar(10, 5);
		Assert.assertEquals(15, somar);
	}

}

