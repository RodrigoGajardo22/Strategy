package eje1_otro;

public class Otros implements Destino {

	private String localidad;
	private String direccion;

	public Otros(String direccion) {
		this.localidad = "Otros";
		this.direccion = direccion;
	}

	@Override
	public String localidad() {

		return localidad;
	}

	@Override
	public String direccion() {

		return direccion;
	}

}
