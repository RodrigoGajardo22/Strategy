package eje1_otro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDistancias {

	private Destino        granBsAs = new GranBA("Jarilla 550");
	private Destino        capital  = new CapitalFederal("Calle falsa 123");
	private List<Producto> productos;
	private Producto       p1, p2, p3;

	@Test
	public void testArgentino() {

		productos = new ArrayList<Producto>();

		p1        = new Producto(1200, 10);
		p2        = new Producto(1500, 15);
		p3        = new Producto(1800, 12);

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);

		Transporte argentino = new CorreoArgentino(productos, new FakeServicio());

		float      esperado  = 6500f;

		assertTrue(esperado == argentino.costoDeEnvio(capital));
		assertFalse(esperado == argentino.costoDeEnvio(granBsAs));
	}

	public void testColectivoSur() {
		productos = new ArrayList<Producto>();

		p1        = new Producto(1200, 10);
		p2        = new Producto(1500, 15);
		p3        = new Producto(1800, 12);

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);

		Transporte sur              = new ColectivoSur(productos);

		float      esperadoACapital = 7500f;
		float      esperadoAGranBs  = 8000f;

		assertTrue(esperadoACapital == sur.costoDeEnvio(capital));
		assertFalse(esperadoACapital == sur.costoDeEnvio(granBsAs));
		assertTrue(esperadoAGranBs == sur.costoDeEnvio(granBsAs));
	}

}
