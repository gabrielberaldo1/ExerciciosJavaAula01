package com.db1.db1start;
import org.junit.Assert;
import org.junit.Test;

public class AreaTrianguloTest {
	
	@Test
	
	public void deveCalcularAreaTriangulo() {
	AreaTriangulo area = new AreaTriangulo();
	double areatri = area.areatriangulo();
	Assert.assertEquals(10, areatri, 0.01);
	
	}

}
