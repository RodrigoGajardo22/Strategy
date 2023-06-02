package eje2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Largo implements FormatoFecha {

	@Override
	public String fecha(LocalDate fecha) {

		return fecha.format(DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy"));
	}

}
