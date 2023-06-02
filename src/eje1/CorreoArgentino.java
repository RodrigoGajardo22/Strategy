package eje1;

import java.util.List;

public class CorreoArgentino implements Transporte {

	private List<Producto> productos;

	public CorreoArgentino(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public float costoDeEnvio(Destino destino) {

		return destino.costoDeEnvio(this) + cantidadDeKm() + extra();

	}

	private float cantidadDeKm() {

		return 0;
	}

	private float extra() {

		return 0;
	}

}
