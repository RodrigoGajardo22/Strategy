package eje2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Corto implements FormatoFecha {

	@Override
	public String fecha(LocalDate fecha) {

		return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

}
