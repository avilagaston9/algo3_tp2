package clases.edificios;

import clases.Tiempo;
import clases.pistas.Pista;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

public class Aeropuerto extends Edificio {
	@Override
	public Pista serVisitado(Novato rango, Tiempo tiempo) {
		return this.pistaOtraCiudadFacil;
	}

	@Override
	public Pista serVisitado(Detective rango, Tiempo tiempo) {
		return this.pistaOtraCiudadMedia;
	}

	@Override
	public Pista serVisitado(Investigador rango, Tiempo tiempo) {
		return this.pistaOtraCiudadDificil;
	}

	@Override
	public Pista serVisitado(Sargento rango, Tiempo tiempo) {
		return this.pistaOtraCiudadDificil;
	}
	/*
	 * private String tipo="Aeropuerto"; private FabricaDePistas fabrica; private
	 * Pista pista;
	 * 
	 * public Aeropuerto(FabricaDePistas unaFabrica){ this.fabrica=unaFabrica;
	 * this.pista=null; }
	 * 
	 * 
	 * @Override public void agregarPista(String caracteristica, Rango rango) {
	 * this.pista=fabrica.crearPista(rango);
	 * this.pista.agregarCaracteristica(caracteristica);
	 * 
	 * }
	 * 
	 * @Override public Pista serVisitado(Edificio edificio, Ciudad
	 * siguienteCiudad,Tiempo tiempo,int visitas) { return
	 * siguienteCiudad.darPistaDe(edificio); }
	 * 
	 * @Override public Pista darPista() { return this.pista; }
	 * 
	 * @Override public boolean sosIgual(Edificio edificio) { return
	 * this.tipo.equals(edificio.tipo()); }
	 * 
	 * @Override public String tipo() { return this.tipo; }
	 */
}
