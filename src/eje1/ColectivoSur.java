package eje1;

import java.util.List;

public class ColectivoSur implements Transporte {

	private List<Producto> productos;

	public ColectivoSur(List<Producto> productos) {

		this.productos = productos;
	}

	@Override
	public float costoDeEnvio(Destino destino) {

		return destino.costoDeEnvio(this) + montoDeProductos() + extra();
	}

	private float montoDeProductos() {

		float monto = 0;

		for (Producto producto : productos) {
			monto += producto.costo();
		}

		return monto;
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

}
