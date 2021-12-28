package clases.edificios;

import clases.Tiempo;
import clases.pistas.*;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

public abstract class Edificio {

	protected Pista pistaOtraCiudadFacil;
	protected Pista pistaOtraCiudadMedia;
	protected Pista pistaOtraCiudadDificil;

	protected PistaFacil pistaPropiaFacil;
	protected PistaMedia pistaPropiaMedia;
	protected PistaDificil pistaPropiaDificil;

	public Edificio() {

		Pista pistaDefault = new PistaSinInformacion();
		this.pistaOtraCiudadFacil = pistaDefault;
		this.pistaOtraCiudadMedia = pistaDefault;
		this.pistaOtraCiudadDificil = pistaDefault;
	}

	public void setPistaPropia(PistaFacil pistaFacil) {
		this.pistaPropiaFacil = pistaFacil;
	}
	public void setPistaPropia(PistaMedia pistaMedia) {
		this.pistaPropiaMedia = pistaMedia;
	}
	public void setPistaPropia(PistaDificil pistaDificil) {
		this.pistaPropiaDificil = pistaDificil;
	}

	public abstract Pista serVisitado(Novato rango, Tiempo tiempo);
	public abstract Pista serVisitado(Detective rango, Tiempo tiempo);
	public abstract Pista serVisitado(Investigador rango, Tiempo tiempo);
	public abstract Pista serVisitado(Sargento rango, Tiempo tiempo);

	public void darPistasA(Edificio edificio) {
		edificio.setPistaOtraCiudad(this.pistaPropiaFacil);
		edificio.setPistaOtraCiudad(this.pistaPropiaMedia);
		edificio.setPistaOtraCiudad(this.pistaPropiaDificil);
	}

	public void setPistaOtraCiudad(PistaFacil pistaFacilOtraCiudad) {
		this.pistaOtraCiudadFacil = pistaFacilOtraCiudad;
	}
	public void setPistaOtraCiudad(PistaMedia pistaMediaOtraCiudad) {
		this.pistaOtraCiudadMedia = pistaMediaOtraCiudad;
	}
	public void setPistaOtraCiudad(PistaDificil pistaDificilOtraCiudad) {
		this.pistaOtraCiudadDificil = pistaDificilOtraCiudad;
	}

	// public boolean sosIgual(Edificio edificio);
}
