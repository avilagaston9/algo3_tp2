package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.Tiempo;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public class Banco extends Edificio {
	@Override
	public Pista serVisitado(Novato rango, Tiempo tiempo) {

		tiempo.sumarVisita();
		return this.pistaOtraCiudadFacil;
	}

	@Override
	public Pista serVisitado(Detective rango, Tiempo tiempo) {

		tiempo.sumarVisita();
		return this.pistaOtraCiudadMedia;
	}

	@Override
	public Pista serVisitado(Investigador rango, Tiempo tiempo) {

		tiempo.sumarVisita();
		return this.pistaOtraCiudadDificil;
	}

	@Override
	public Pista serVisitado(Sargento rango, Tiempo tiempo) {

		tiempo.sumarVisita();
		return this.pistaOtraCiudadDificil;
	}
	/*
	 * private String tipo="Banco"; private FabricaDePistas fabrica; private Pista
	 * pista;
	 * 
	 * public Banco(FabricaDePistas unafabrica){ this.fabrica=unafabrica;
	 * this.pista=null; }
	 * 
	 * @Override public void agregarPista(String caracteristica, Rango rango) {
	 * this.pista=fabrica.crearPista(rango);
	 * this.pista.agregarCaracteristica(caracteristica); }
	 * 
	 * @Override public Pista serVisitado(Edificio edificio,Ciudad
	 * siguienteCiudad,Tiempo tiempo,int visitas) { Pista pista =
	 * siguienteCiudad.darPistaDe(edificio); tiempo.sumarHoras(visitas); return
	 * pista; }
	 * 
	 * @Override public Pista darPista() { return pista; }
	 * 
	 * @Override public boolean sosIgual(Edificio edificio) { return
	 * this.tipo.equals(edificio.tipo()); }
	 * 
	 * @Override public String tipo() { return this.tipo; }
	 * 
	 * 
	 * 
	 * }
	 * 
	 */

}