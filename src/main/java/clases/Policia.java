package clases;

import java.util.LinkedList;
import clases.OrdenDeArresto.OrdenArresto;
import clases.OrdenDeArresto.SinOrdenDeArresto;
import clases.armas.Arma;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.rangos.Rango;

public class Policia {
	private Ciudad ciudadActual;
	private Tiempo tiempoTranscurrido;
	private Rango rango;
	private OrdenArresto ordenDeArresto;
	private int cantidadHeridasDeCuchillo;
	private String nombre;

	public Policia(Rango rango, Ciudad actual) {
		this.tiempoTranscurrido = new Tiempo();
		this.rango = rango;
		this.ciudadActual = actual;
		this.ordenDeArresto = new SinOrdenDeArresto();
		this.cantidadHeridasDeCuchillo = 0;
	}

	public Policia(Rango rango) {
		this.tiempoTranscurrido = new Tiempo();
		this.rango = rango;
		this.ordenDeArresto = new SinOrdenDeArresto();
		this.cantidadHeridasDeCuchillo = 0;
	}

	public void dormir() {
		this.tiempoTranscurrido.dormir();
	}

	public int tiempoTranscurridoEnHoras() {

		return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
	}

	public void herirCon(Arma unArma) {
		unArma.Herir(this.tiempoTranscurrido);
	}

	public void viajarA(Ciudad nuevaCiudad) {

		int kilometros = (int) this.ciudadActual.calcularDistanciaEnKms(nuevaCiudad);
		rango.viajar(tiempoTranscurrido, kilometros);
		setCiudadActual(nuevaCiudad);
	}

	public void setCiudadActual(Ciudad unaCiudad) {

		this.ciudadActual = unaCiudad;
	}

	public boolean esCiudadActual(Ciudad unaCiudad) {

		return unaCiudad == this.ciudadActual;
	}

	public boolean arrestarA(Ladron unLadron) {
		if (unLadron.serArrestado(this.ordenDeArresto, this.ciudadActual)) {
			this.rango.sumarArresto();
			return true;
		}
		return false;
	}

	public void emitirOrdenDeArresto(OrdenArresto ordenDeArresto) {
		this.tiempoTranscurrido.sumarHoras(3);
		this.ordenDeArresto = ordenDeArresto;
	}

	public int cantidadArrestos() {
		return this.rango.cantidadArrestos();
	}

	// METODO AUXILIAR PARA E2 C5.
	public void agregarArresto() {
		this.rango = this.rango.sumarArresto();
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudadActual = ciudad;
	}

	public void setNombre(String nombrePolicia) {

		this.nombre = nombrePolicia;
	}

	public String getNombre() {

		return this.nombre;
	}

	public Ciudad getCiudadActual() {
		return this.ciudadActual;
	}

	public LinkedList<Pista> visitar(Edificio unEdificio, Ladron ladron) {

		LinkedList<Pista> pistas = new LinkedList<>();
		pistas.add(this.rango.visitar(unEdificio, this.tiempoTranscurrido));
		pistas.add(this.rango.pedirPistaLadron(ladron));
		return pistas;
	}





	//Nueva alternativa
	private LinkedList<Pista> visitarEdificio(Edificio unEdificio, Ladron ladron) {

		LinkedList<Pista> pistas = new LinkedList<>();
		pistas.add(this.rango.visitar(unEdificio, this.tiempoTranscurrido));
		pistas.add(this.rango.pedirPistaLadron(ladron));
		return pistas;
	}


    public LinkedList<Pista> visitarBancoActual(Ladron ladron) {

		return this.visitarEdificio(this.ciudadActual.getBanco(), ladron);
    }

	public LinkedList<Pista> visitarAeropuertoActual(Ladron ladron) {

		return this.visitarEdificio(this.ciudadActual.getAeropuerto(), ladron);
	}

	public LinkedList<Pista> visitarBibliotecaActual(Ladron ladron) {

		return this.visitarEdificio(this.ciudadActual.getBiblioteca(), ladron);
	}

}