package edu.fiuba.algo3.modelo.FabricaEdificios;

import edu.fiuba.algo3.modelo.edificios.Biblioteca;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.pistas.PistaDificil;
import edu.fiuba.algo3.modelo.pistas.PistaFacil;
import edu.fiuba.algo3.modelo.pistas.PistaMedia;

public class FabricaBiblioteca implements FabricaEdificios {

	@Override
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil) {
		Edificio biblioteca = new Biblioteca();
		biblioteca.setPistaPropia(pistaFacil);
		biblioteca.setPistaPropia(pistaMedia);
		biblioteca.setPistaPropia(pistaDificil);
		return biblioteca;
	}
}
