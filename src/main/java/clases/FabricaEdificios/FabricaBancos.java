package clases.FabricaEdificios;

import clases.edificios.Banco;
import clases.edificios.Edificio;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;

public class FabricaBancos implements FabricaEdificios {

	@Override
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil) {

		Edificio banco = new Banco();
		banco.setPistaPropia(pistaFacil);
		banco.setPistaPropia(pistaMedia);
		banco.setPistaPropia(pistaDificil);

		return banco;
	}
}
