package edu.fiuba.algo3.modelo.FabricaEdificios;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.PistaDificil;
import edu.fiuba.algo3.modelo.pistas.PistaFacil;
import edu.fiuba.algo3.modelo.pistas.PistaMedia;

public interface FabricaEdificios {
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil);
}// todo deberia pasarse las pistas propias sacadas del json (las de otro paises
	// son default)
