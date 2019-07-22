package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;

public class MudarNomeParaAlunoTest {
	
	@Test
	
	public void mudaronome() {
		MudarNomeParaAluno nomealuno = new MudarNomeParaAluno();
		String mudar = nomealuno.mudarNome();
		Assert.assertEquals("ALUNO da Silva Beraldo", mudar);
		
	}

}
