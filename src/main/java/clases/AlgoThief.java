package clases;

import clases.Exceptions.ExcepcionSinOrdenDeArresto;
import clases.InteraccionConArchivos.LectorDeArchivos.EscribirDatosFachada;
import clases.InteraccionConArchivos.LectorDeArchivos.ObtenerDatosFachada;
import clases.ObjetoRobado.ObjetoRobado;
import clases.OrdenDeArresto.OrdenArresto;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ciudades.Ciudad;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.rangos.Novato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class AlgoThief {

	private final ObtenerDatosFachada obtenedorDeDatos;
	private final EscribirDatosFachada registradorDeDatos;
	private ArrayList<Observador> observadores;
	private Policia policia;
	private Ladron ladron;
	private ObjetoRobado objetoRobado;
	private Computadora computadora;

	private boolean jugadorCargado;
	private Boolean juegoEnCurso;
	private Boolean juegoGanado;
	private int limiteTiempo;
	private String nombrePolicia;
	private boolean juegoIniciado;
	private ArrayList<Ciudad> ciudades;

	public AlgoThief(ObtenerDatosFachada obtenedorDeDatos, EscribirDatosFachada registradorDeDatos) {

		this.observadores = new ArrayList<Observador>();
		this.obtenedorDeDatos = obtenedorDeDatos;

		this.registradorDeDatos = registradorDeDatos;

		this.jugadorCargado = false;
		this.juegoGanado = false;
		this.juegoEnCurso = false;
		this.juegoIniciado = false;
	}

	private Policia obtenerPolicia(ArrayList<Policia> listaPolicias, String nombrePolicia) {

		for(Policia p : listaPolicias){
			if (p.seHaceLlamar(nombrePolicia)){
				return (p);
			}
		}
		PoliciaBuilder policiaBuilder = new PoliciaBuilder();
		policiaBuilder.setNombre(nombrePolicia);
		policiaBuilder.setRango(new Novato());

		return (policiaBuilder.getPolicia());
	}

	public void setNombrePolicia(String nombrePolicia) {

		ArrayList<Policia> policias = this.obtenedorDeDatos.obtenerPolicias();

		this.policia = this.obtenerPolicia(policias, nombrePolicia);
		this.jugadorCargado = true;
	}

	public void iniciarJuego(){

		this.juegoEnCurso = true;
		this.juegoGanado = false;
		this.juegoIniciado = true;
		this.limiteTiempo = 154;

		ArrayList<Ladron> ladrones = obtenedorDeDatos.obtenerLadrones();
		this.ciudades = obtenedorDeDatos.obtenerCiudades();
		ArrayList<ObjetoRobado> objetosRobados = obtenedorDeDatos.obtenerObjetosRobados();
		Collections.shuffle(this.ciudades);
		Collections.shuffle(objetosRobados);

		this.objetoRobado = this.policia.getRango().getObjetoRobado(objetosRobados);
		RutaDeEscape rutaDeEscape = this.objetoRobado.crearRutaDeEscape(this.ciudades);


		this.policia.setCiudadActual(rutaDeEscape.getRuta().get(0));
		this.policia.resetearTiempo();

		Random random = new Random();
		this.ladron = ladrones.get(random.nextInt(ladrones.size()));
		this.ladron.setCiudad(rutaDeEscape.getRuta().get(rutaDeEscape.getRuta().size() - 1));

		this.computadora = new Computadora(ladrones);

		this.ladron.setRutaDeEscape(rutaDeEscape);
		this.actualizarObservadores();
	}

	public void setObservador(Observador observador) {
		this.observadores.add(observador);
	}

	private void actualizarObservadores() {

		for (Observador o : this.observadores) {

			o.actualizar();
		}
	}

	// métodos para jugar
	public LinkedList<Pista> visitar(Edificio unEdificio) {
		LinkedList<Pista> pistas = this.policia.visitar(unEdificio, this.ladron);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
		return pistas;
	}

	public int tiempoTranscurridoEnHoras() {
		return this.policia.tiempoTranscurridoEnHoras();
	}

	// todo ¿herir con??

	public void viajarA(Ciudad nuevaCiudad) {

		this.policia.viajarA(nuevaCiudad);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
	}

	public boolean esCiudadActual(Ciudad unaCiudad) {
		return this.policia.esCiudadActual(unaCiudad);
	}

	public void arrestarA(Ladron unLadron) throws ExcepcionSinOrdenDeArresto {
		this.policia.arrestarA(unLadron);
		this.actualizarEstadoJuego();
	}

	public void emitirOrdenDeArresto(Ladron ladron) {
		OrdenArresto orden = this.computadora.emitirOrdenDeArresto(ladron);
		this.policia.emitirOrdenDeArresto(orden);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
	}

	public int cantidadArrestos() {
		return this.policia.cantidadArrestos();
	}

	public void cargarCaracteristica(CaracteristicaLadron caracteristica) {
		computadora.cargarCaracteristica(caracteristica);
	}

	public void buscarSospechosos() {
		this.computadora.buscarSospechosos();
	}

	public String nombreObjetoRobado() {
		return this.objetoRobado.getNombre();
	}

	public String nombreCiudadInicial() {
		return this.objetoRobado.getNombreCiudad();
	}


	public String getNombrePolicia() {
		return this.policia.getNombre();
	}

	public String getNombreCiudadActual() {
		return this.policia.getCiudadActual().getNombre();
	}

	public Ciudad getCiudadActual() {

		return this.policia.getCiudadActual();
	}

	public Computadora getComputadora() {
		return this.computadora;
	}

	// nueva alternativa
	public LinkedList<Pista> visitarBancoActual() {
		LinkedList<Pista> pistas = this.policia.visitarBancoActual(this.ladron);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
		return pistas;
	}

	// nueva alternativa
	public LinkedList<Pista> visitarAeropuertoActual() {
		LinkedList<Pista> pistas = this.policia.visitarAeropuertoActual(this.ladron);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
		return pistas;
	}

	// nueva alternativa
	public LinkedList<Pista> visitarBibliotecaActual() {
		LinkedList<Pista> pistas = this.policia.visitarBibliotecaActual(this.ladron);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
		return pistas;
	}

	private void actualizarEstadoJuego() {

		if (this.tiempoInsuficiente()) {
			this.juegoEnCurso = false;
		}
		try {
			if (policia.arrestarA(ladron)) {
				this.juegoGanado = true;
				this.juegoEnCurso = false;
			}
		} catch (ExcepcionSinOrdenDeArresto e) {
			this.juegoEnCurso = false;
		}
	}

	public ArrayList<Ladron> getSospechosos() {
		return this.computadora.getSospechosos();
	}

	public String ladronDeOrdenDeArresto() {
		return this.policia.nombreLadronEnOrdenDeArresto();
	}

	public boolean juegoEnCurso() {

		return this.juegoEnCurso;
	}

	public boolean juegoGanado() {

		return this.juegoGanado;
	}

	public boolean tiempoInsuficiente() {

		return (this.limiteTiempo < this.policia.tiempoTranscurridoEnHoras());
	}

	public String getNombreLadron() {
		return this.ladron.getNombre();
	}

	public void borrarCaracteristica(CaracteristicaLadron caracteristica) {
		this.computadora.borrarCaracteristica(caracteristica);
	}

	public boolean jugadorCargado() {

		return this.jugadorCargado;
	}

	public boolean juegoIniciado() {

		return this.juegoIniciado;
	}

	public ArrayList<Ciudad> getCiudades() {

		return this.ciudades;
	}

	public void registrarDatos(){
		this.registradorDeDatos.actualizar(this.policia);
	}

	public String getDescripcionCiudadActual() {
		return this.policia.getCiudadActual().getDescripcion();
	}
}
