package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import calculo.Simulador;
import junit.framework.TestCase;

public class TestSimu extends TestCase {
	private Simulador simulador;
	
	@Test 
	public void teste1(){
		double res = this.simulador.calcularIPTU("1", 180000, 0);
		double ve = 1164.55;
		assertEquals(ve, res);
	}
	
	@Test 
	public void teste2(){
		double res = this.simulador.calcularIPTU("3", 430000, 0);
		double ve = 6881.9;
		assertEquals(ve, res);
	}


	@Test 
	public void teste3(){
		double res = this.simulador.calcularIPTU("2", 100000, 0);
		double ve = 1624.168;
		assertEquals(ve, res);
	}
	@Test 
	public void teste4(){
		double res = this.simulador.calcularIPTU("1", 180000, 500);
		double ve = 664.55;
		assertEquals(ve, res);
	}
	@Test 
	public void teste5(){
		double res = this.simulador.calcularIPTU("3", 430000, 10000);
		double ve = 5881.9;
		assertEquals(ve, res);
	}
 }
