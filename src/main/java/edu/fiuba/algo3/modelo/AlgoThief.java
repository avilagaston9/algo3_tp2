package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.interfaz.Observador;
import edu.fiuba.algo3.modelo.Exceptions.ExcepcionSinOrdenDeArresto;
import edu.fiuba.algo3.modelo.InteraccionConArchivos.RegistrarDatosFachada;
import edu.fiuba.algo3.modelo.InteraccionConArchivos.ObtenerDatosFachada;
import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;
import edu.fiuba.algo3.modelo.OrdenDeArresto.OrdenArresto;
import edu.fiuba.algo3.modelo.Policia.Policia;
import edu.fiuba.algo3.modelo.Policia.PoliciaBuilder;
import edu.fiuba.algo3.modelo.caracteristicasLadron.CaracteristicaLadron;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.ladron.RutaDeEscape;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.rangos.Novato;

import java.util.*;

public class AlgoThief {

	private final ObtenerDatosFachada obtenedorDeDatos;
	private final RegistrarDatosFachada registradorDeDatos;
	private ArrayList<Observador> observadores;
	private Policia policia;
	private Ladron ladron;
	private ObjetoRobado objetoRobado;
	private Computadora computadora;

	private Boolean juegoEnCurso;
	private Boolean juegoGanado;
	private int limiteTiempo;
	private ArrayList<Ciudad> ciudades;

	public AlgoThief(ObtenerDatosFachada obtenedorDeDatos, RegistrarDatosFachada registradorDeDatos) {

		this.observadores = new ArrayList<Observador>();
		this.obtenedorDeDatos = obtenedorDeDatos;

		this.registradorDeDatos = registradorDeDatos;

		this.juegoGanado = false;
		this.juegoEnCurso = false;
	}

	private Policia obtenerPolicia(ArrayList<Policia> listaPolicias, String nombrePolicia) {

		for(Policia p : listaPolicias){
			if (p.seLlama(nombrePolicia)){
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
	}

	public void iniciarJuego(){

		this.juegoEnCurso = true;
		this.juegoGanado = false;
		this.limiteTiempo = 154;

		ArrayList<Ladron> ladrones = obtenedorDeDatos.obtenerLadrones();
		this.ciudades = obtenedorDeDatos.obtenerCiudades();
		ArrayList<ObjetoRobado> objetosRobados = obtenedorDeDatos.obtenerObjetosRobados();
		Collections.shuffle(this.ciudades);
		Collections.shuffle(objetosRobados);

		this.objetoRobado = this.policia.getObjetoRobado(objetosRobados);
		RutaDeEscape rutaDeEscape = this.objetoRobado.crearRutaDeEscape(this.ciudades);

		this.policia.setCiudadActual(rutaDeEscape.getRuta().get(0));
		this.policia.resetear();


		Random random = new Random();
		this.ladron = ladrones.get(random.nextInt(ladrones.size()));
		rutaDeEscape.asignarCiudad(ladron);

		this.computadora = new Computadora(ladrones);

		this.ladron.setRutaDeEscape(rutaDeEscape);
		this.actualizarObservadores();
	}

	public void setObservador(Observador observador) {
		this.observadores.add(observador);
	}

	private void actualizarObservadores() {

		for (Observador o : ((List<Observador>)this.observadores.clone())) {

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

	public void emitirOrdenDeArresto(Ladron ladron) {
		OrdenArresto orden = this.computadora.emitirOrdenDeArresto(ladron);
		this.policia.emitirOrdenDeArresto(orden);
		this.actualizarEstadoJuego();
		this.actualizarObservadores();
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

	public ArrayList<Ciudad> getCiudades() {

		return this.ciudades;
	}

	public void registrarDatos(){
		this.registradorDeDatos.actualizar(this.policia);
	}

	public String getDescripcionCiudadActual() {
		return this.policia.getCiudadActual().getDescripcion();
	}

	public String getRangoPolicia() {

		return this.policia.getNombreRango();
	}
}
