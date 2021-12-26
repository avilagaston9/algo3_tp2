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
//		banco.setPista(pistaFacil);
//		banco.setPista(pistaMedia);
//		banco.setPista(pistaDificil);
		return banco;
	}
}
