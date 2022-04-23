package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
}
