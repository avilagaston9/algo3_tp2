package clases.FabricaEdificios;

import clases.edificios.Edificio;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;

public interface FabricaEdificios {
	public Edificio crearEdificio(PistaFacil pistaFacil, PistaMedia pistaMedia, PistaDificil pistaDificil);
}// todo deberia pasarse las pistas propias sacadas del json (las de otro paises
	// son default)
