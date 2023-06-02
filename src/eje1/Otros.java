package eje1;

public class Otros implements Destino {

	private final float montoCorreoArgentino = 800f;
	private final float montoColectivoSur    = 3000f;

	@Override
	public float costoDeEnvio(CorreoArgentino transporte) {

		return montoCorreoArgentino;
	}

	@Override
	public float costoDeEnvio(ColectivoSur transporte) {

		return montoColectivoSur;
	}

}
