package eje1;

public class CapitalFederal implements Destino {

	private final float montoCorreoArgentino = 500f;
	private final float montoColectivoSur    = 1000f;

	@Override
	public float costoDeEnvio(CorreoArgentino transporte) {

		return montoCorreoArgentino;
	}

	@Override
	public float costoDeEnvio(ColectivoSur transporte) {

		return montoColectivoSur;
	}

}
