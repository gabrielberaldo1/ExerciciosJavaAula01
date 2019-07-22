package com.db1.db1start;
import org.junit.Assert;
import org.junit.Test;

public class Media3NumerosTest {

	
	@Test
	
	public void deveFazerMedia3Numeros() {
		Media3Numeros media = new Media3Numeros();
		double media3 = media.media();
	Assert.assertEquals(5, media3, 0.01);
	
		
	}
}
