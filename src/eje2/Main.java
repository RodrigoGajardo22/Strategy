package eje2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Persona juan  = new Persona(new Corto(), "Juan", LocalDate.of(2020, 02, 20));
		Persona pedro = new Persona(new Largo(), "pedro", LocalDate.of(2020, 02, 20));

		System.out.println(juan.fechaDeNaciomiento());
		System.out.println(pedro.fechaDeNaciomiento());

	}

}
