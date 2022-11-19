package atividade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCpf {
	
	ValidCpf cpf;
	
	@Before
	public void setUp() throws Exception {
		cpf = new ValidCpf();
	}

	@Test
	public void testIsCPF() {
		assertTrue("CASO 1:", cpf.isCPF("15692626675"));
	}
	
	@Test
	public void testIsCPF2() {
		assertTrue("CASO 2:", cpf.isCPF("15556915601"));
	}
	
	@Test
	public void testIsCPF3() {
		assertFalse("CASO 2:", cpf.isCPF("15692626675"));
	}
	
	@Test
	public void testIsCPF4() {
		assertFalse("CASO 2:", cpf.isCPF("32742189897"));
	}
	
	@Test
	public void testIsCPF5() {
		assertFalse("CASO 2:", cpf.isCPF("15232189841"));
	}

}
