package eje1_otro;

public class Producto {

	private float monto;
	private int   kg;

	public Producto(float monto, int kg) {
		this.monto = monto;
		this.kg    = kg;
	}

	public float costo() {

		return monto;
	}

	public int kg() {
		return kg;
	}

}
