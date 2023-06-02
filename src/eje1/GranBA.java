package eje1;

public class GranBA implements Destino {

	private final float montoCorreoArgentino = 800f;
	private final float montoColectivoSur    = 1500f;

	@Override
	public float costoDeEnvio(CorreoArgentino transporte) {

		return montoCorreoArgentino;
	}

	@Override
	public float costoDeEnvio(ColectivoSur transporte) {

		return montoColectivoSur;
	}

}
