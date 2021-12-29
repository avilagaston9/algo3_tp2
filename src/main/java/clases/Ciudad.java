package clases;

import clases.edificios.Aeropuerto;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.edificios.Edificio;

public class Ciudad {

	private String nombre;
	private Coordenadas coordenadas;
	private Banco banco;
	private Biblioteca biblioteca;
	private Aeropuerto aeropuerto;
	private String descripcion;

	public Ciudad(String nombreCiudad, Coordenadas coordenadas, Banco banco, Biblioteca biblioteca, Aeropuerto aeropuerto, String descripcion) {

		this.nombre = nombreCiudad;
		this.coordenadas = coordenadas;
		this.banco = banco;
		this.biblioteca = biblioteca;
		this.aeropuerto = aeropuerto;
		this.descripcion = descripcion;
	}

	// Para mantener los test de entregas anteriores. //todo borrar
	public Ciudad(String nombreCiudad, Coordenadas coordenadas) {

		this.nombre = nombreCiudad;
		this.coordenadas = coordenadas;
	}
	/*
	 * 
	 * public void agregarEdificio(Edificio unEdificio) { edificios.add(unEdificio);
	 * }
	 * 
	 * public void agregarLadron(Ladron ladron) {
	 * 
	 * this.ladron = ladron; }
	 * 
	 * public void agregarSiguiente(Ciudad ciudadSiguiente, int distancia) {
	 * siguienteCiudad = ciudadSiguiente; distancias.put(ciudadSiguiente,
	 * distancia); }
	 * 
	 * public void agregarAdyacente(Ciudad ciudadAdaycente, int distancia) {
	 * distancias.put(ciudadAdaycente, distancia); }
	 * 
	 * 
	 * public Pista visitarEdificio (Edificio unEdificio,Tiempo tiempoTranscurrido){
	 * Pista pista =
	 * (edificios.get(edificios.indexOf(unEdificio))).serVisitado(unEdificio,this.
	 * siguienteCiudad,tiempoTranscurrido,this.visitas); this.sumarVisita(); return
	 * pista; }
	 * 
	 * public void sumarVisita() { this.visitas++; }
	 * 
	 * 
	 * public Pista darPistaDe(Edificio edificio) { for (int i=0;i<
	 * edificios.size();i++){ if(edificios.get(i).sosIgual(edificio)){ return
	 * edificios.get(i).darPista(); } } return null; }
	 * 
	 */
	// todo borrar basura?

	public double calcularDistanciaEnKms(Ciudad otraCiudad) {

		return otraCiudad.calcularDistanciaEnKms(this.coordenadas);
	}

	protected double calcularDistanciaEnKms(Coordenadas otrasCoordenadas) {
		return otrasCoordenadas.calcularDistancia(this.coordenadas);
	}

	public boolean esIgualA(String nombre) {
		return this.nombre.equals(nombre);
	}

	public void setPistas(Ciudad otraCiudad) {
		otraCiudad.darPistasA(this.banco);
		otraCiudad.darPistasA(this.biblioteca);
		otraCiudad.darPistasA(this.aeropuerto);

	}

	private void darPistasA(Aeropuerto aeropuerto) {
		this.aeropuerto.darPistasA(aeropuerto);
	}

	private void darPistasA(Biblioteca biblioteca) {
		this.biblioteca.darPistasA(biblioteca);
	}

	private void darPistasA(Banco banco) {
		this.banco.darPistasA(banco);
	}

	public String nombreCiudad() {
		return this.nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Edificio getAeropuerto() {

		return this.aeropuerto;
	}

	public Edificio getBiblioteca() {

		return this.biblioteca;
	}

	public Edificio getBanco() {
		return this.banco;
	}
}
