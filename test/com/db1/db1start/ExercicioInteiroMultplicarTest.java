package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioInteiroMultplicarTest {
	@Test
	public void deveMultiplicarDoisValores() {
		ExercicioInteiro_Multiplicar exerciciomultiplicar = new ExercicioInteiro_Multiplicar();
		int multiplicar = exerciciomultiplicar.multiplicar(10, 5);
		Assert.assertEquals(50, multiplicar);
	}
}
