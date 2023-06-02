package eje1_otro;

public class CapitalFederal implements Destino {
	private String localidad;
	private String direccion;

	public CapitalFederal(String direccion) {
		this.localidad = "Capital Federal";
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
