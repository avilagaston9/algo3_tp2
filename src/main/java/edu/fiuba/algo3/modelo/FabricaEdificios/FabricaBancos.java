package edu.fiuba.algo3.modelo.FabricaEdificios;

import edu.fiuba.algo3.modelo.edificios.Banco;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.PistaDificil;
import edu.fiuba.algo3.modelo.pistas.PistaFacil;
import edu.fiuba.algo3.modelo.pistas.PistaMedia;

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
