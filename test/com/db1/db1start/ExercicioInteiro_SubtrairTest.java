package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioInteiro_SubtrairTest {
	
	@Test
	public void deveSubtrairDoisValores() {
		ExercicioInteiro_Subtrair exerciciosubtrair = new ExercicioInteiro_Subtrair();
		int subtrair = exerciciosubtrair.subtrair(10, 5);
		Assert.assertEquals(5, subtrair);
	}
}
