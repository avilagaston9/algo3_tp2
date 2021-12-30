package edu.fiuba.algo3.modelo.FabricaEdificios;

import edu.fiuba.algo3.modelo.edificios.Aeropuerto;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.PistaDificil;
import edu.fiuba.algo3.modelo.pistas.PistaFacil;
import edu.fiuba.algo3.modelo.pistas.PistaMedia;

public class FabricaAeropuerto implements FabricaEdificios {

	@Override
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil) {
		Edificio aeropuerto = new Aeropuerto();
		aeropuerto.setPistaPropia(pistaFacil);
		aeropuerto.setPistaPropia(pistaMedia);
		aeropuerto.setPistaPropia(pistaDificil);
		return aeropuerto;
	}
}
