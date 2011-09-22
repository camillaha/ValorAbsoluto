import static org.junit.Assert.*;

import org.junit.Test;


public class AbsolutoTest {

	@Test
	public void valorAbsolutoParaPositivo() {
		int resultado = Calcula.absoluto(3);
		assertEquals(3, resultado);
	}
	
	@Test
	public void valorAbsolutoParaNegativo() {
		int resultado = Calcula.absoluto(-3);
		assertEquals(3, resultado);
	}
	
	@Test
	public void valorAbsolutoParaZero() {
		int resultado = Calcula.absoluto(0);
		assertEquals(0, resultado);
	}

}
