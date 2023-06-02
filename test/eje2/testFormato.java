package eje2;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class testFormato {

	@Test
	public void test() {
		Persona juan         = new Persona(new Corto(), "Juan", LocalDate.of(2020, 02, 20));
		Persona pedro        = new Persona(new Largo(), "pedro", LocalDate.of(2020, 02, 20));

		String  formatoCorto = "20-02-2020";
		String  formatoLargo = "jueves, 20 de febrero de 2020";

		assertTrue(formatoCorto.equals(juan.fechaDeNaciomiento()));
		assertTrue(formatoLargo.equals(pedro.fechaDeNaciomiento()));

	}

}
