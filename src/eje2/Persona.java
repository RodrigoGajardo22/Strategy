package eje2;

import java.time.LocalDate;

public class Persona {

	private String       nombre;
	private FormatoFecha formato;
	private LocalDate    fechaDeNacimiento;

	public Persona(FormatoFecha formato, String nombre, LocalDate fecha) {
		this.nombre            = nombre;
		this.formato           = formato;
		this.fechaDeNacimiento = fecha;

	}

	public String fechaDeNaciomiento() {

		return formato.fecha(fechaDeNacimiento);
	}

}
