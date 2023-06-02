package eje1_otro;

import java.util.List;

public class CorreoArgentino implements Transporte {

	private List<Producto> productos;
	private ServicioKm     servicioKm;

	private final float    costoFijoCapitalFederal = 500f;
	private final float    costoFijoOtrosDestinos  = 800f;

	public CorreoArgentino(List<Producto> productos, ServicioKm servicio) {
		this.servicioKm = servicio;
		this.productos  = productos;
	}

	@Override
	public float costoDeEnvio(Destino destino) {

		if (destino.localidad().equals("Capital Federal"))
			return calculoCapitalFederal();

		return calculoOtrasLocalidades();

	}

	private float calculoOtrasLocalidades() {

		return costoFijoOtrosDestinos + extraPorCantidadDeKm() + costoDeProductos();
	}

	private float calculoCapitalFederal() {

		return costoFijoCapitalFederal + extraPorCantidadDeKm() + costoDeProductos();
	}

	private float extraPorCantidadDeKm() {

		return servicioKm.distancia();
	}

	private float costoDeProductos() {
		float costo = 0;
		for (Producto producto : productos) {
			costo += producto.costo();
		}
		return costo;
	}

}
