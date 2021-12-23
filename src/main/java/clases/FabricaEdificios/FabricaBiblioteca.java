package clases.FabricaEdificios;

import clases.edificios.Biblioteca;
import clases.edificios.Edificio;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;

public class FabricaBiblioteca implements FabricaEdificios {

	@Override
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil) {
		Edificio biblioteca = new Biblioteca();
		biblioteca.setPista(pistaFacil);
		biblioteca.setPista(pistaMedia);
		biblioteca.setPista(pistaDificil);
		return biblioteca;
	}
}
