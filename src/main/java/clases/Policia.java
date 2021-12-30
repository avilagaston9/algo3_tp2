package clases;

import clases.Exceptions.ExcepcionSinOrdenDeArresto;
import clases.ObjetoRobado.ObjetoRobado;
import clases.OrdenDeArresto.OrdenArresto;
import clases.OrdenDeArresto.SinOrdenDeArresto;
import clases.armas.Arma;
import clases.ciudades.Ciudad;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.rangos.Rango;

import java.util.ArrayList;
import java.util.LinkedList;

public class Policia {
	private Ciudad ciudadActual;
	private Tiempo tiempoTranscurrido;
	private Rango rango;
	private OrdenArresto ordenDeArresto;
	private int cantidadHeridasDeCuchillo;
	private String nombre;

	public Policia(Rango rango, String nombre) {
		this.tiempoTranscurrido = new Tiempo();
		this.rango = rango;
		this.ordenDeArresto = new SinOrdenDeArresto();
		this.cantidadHeridasDeCuchillo = 0;
		this.setNombre(nombre);
	}

	public Policia(Rango rango, Ciudad ciudadInicial){

		this.tiempoTranscurrido = new Tiempo();
		this.rango = rango;
		this.ordenDeArresto = new SinOrdenDeArresto();
		this.cantidadHeridasDeCuchillo = 0;
		this.ciudadActual = ciudadInicial;
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

	public boolean arrestarA(Ladron unLadron) throws ExcepcionSinOrdenDeArresto {

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

		// metodo en ruta de escape "pertenece" y le paso como parametro la ciudad
		// actual,
		// si devuelve false, NO se pide pista al ladron....
		if (ladron.ciudadPerteneceASuRutaDeEscape(this.ciudadActual)) {
			pistas.add(this.rango.pedirPistaLadron(ladron));
		}
		return pistas;
	}

	/*
	 * //Nueva alternativa private LinkedList<Pista> visitarEdificio(Edificio
	 * unEdificio, Ladron ladron) {
	 * 
	 * LinkedList<Pista> pistas = new LinkedList<>();
	 * pistas.add(this.rango.visitar(unEdificio, this.tiempoTranscurrido));
	 * 
	 * if(ladron.ciudadPerteneceASuRutaDeEscape(this.ciudadActual)){
	 * pistas.add(this.rango.pedirPistaLadron(ladron)); } return pistas; }
	 * 
	 */

	public LinkedList<Pista> visitarBancoActual(Ladron ladron) {

		return this.visitar(this.ciudadActual.getBanco(), ladron);
	}

	public LinkedList<Pista> visitarAeropuertoActual(Ladron ladron) {

		return this.visitar(this.ciudadActual.getAeropuerto(), ladron);
	}

	public LinkedList<Pista> visitarBibliotecaActual(Ladron ladron) {

		return this.visitar(this.ciudadActual.getBiblioteca(), ladron);
	}

	public String nombreLadronEnOrdenDeArresto() {
		return this.ordenDeArresto.nombreLadronEnLaOrden();
	}

	//!!!
	public Boolean seLlama(String unNombre){
		return (this.nombre.equals(unNombre));
	}

	//!!!
	public Rango getRango(){
		return (this.rango);
	}

	//!!!
	public void resetearTiempo(){
		this.tiempoTranscurrido = new Tiempo();
	}

	public ObjetoRobado getObjetoRobado(ArrayList<ObjetoRobado> objetosRobados) {
		return this.rango.getObjetoRobado(objetosRobados);
	}
}