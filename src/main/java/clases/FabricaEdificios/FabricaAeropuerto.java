package clases.FabricaEdificios;

import clases.edificios.Aeropuerto;
import clases.edificios.Edificio;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;

public class FabricaAeropuerto implements FabricaEdificios {

	@Override
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil) {
		Edificio aeropuerto = new Aeropuerto();
		aeropuerto.setPistaOtraCiudad(pistaFacil);
		aeropuerto.setPistaPropia(pistaMedia);
		aeropuerto.setPistaPropia(pistaDificil);
		return aeropuerto;
	}
}
