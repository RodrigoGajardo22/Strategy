package eje1_otro;

import java.util.List;

public class ColectivoSur implements Transporte {

	private List<Producto> productos;
	private final float    costoFijoCapitalFederal = 1000f;
	private final float    costoFijoGranBsAs       = 1500f;
	private final float    costoFijoOtrosDestinos  = 3000f;

	public ColectivoSur(List<Producto> productos) {
		this.productos = productos;

	}

	@Override
	public float costoDeEnvio(Destino destino) {
		if (destino.localidad().equals("Capital Federal"))
			return calculoCapitalFederal();
		if (destino.localidad().equals("Gran Buenos Aires"))
			return calculoGranBsAs();

		return calculoOtrasLocalidades();
	}

	private float calculoCapitalFederal() {
		return costoFijoCapitalFederal + extra() + costoDeProductos();
	}

	private float calculoGranBsAs() {
		return costoFijoGranBsAs + extra() + costoDeProductos();
	}

	private float calculoOtrasLocalidades() {
		return costoFijoOtrosDestinos + extra() + costoDeProductos();
	}

	private float extra() {
		int peso = 0;
		for (Producto producto : productos) {
			peso += producto.kg();
		}
		if (peso > 5 && peso < 30)
			return 500;
		if (peso >= 30)
			return 2000;
		return 0;
	}

	private float costoDeProductos() {
		float costo = 0;
		for (Producto producto : productos) {
			costo += producto.costo();
		}
		return costo;
	}

}
