package eje1_otro;

public class GranBA implements Destino {

	private String localidad;
	private String direccion;

	public GranBA(String direccion) {
		this.localidad = "Gran Buenos Aires";
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
