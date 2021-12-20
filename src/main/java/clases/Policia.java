package clases;

import clases.armas.Arma;
import clases.ladron.Ladron;
import clases.edificios.Edificio;
import clases.pistas.Pista;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Rango;
import clases.rangos.Sargento;

import java.util.LinkedList;

public class Policia {
    private Ciudad ciudadActual;
    private Tiempo tiempoTranscurrido;
    private Rango rango;
    private OrdenArresto ordenDeArresto;
    private int cantidadHeridasDeCuchillo;

    public Policia(Rango rango, Ciudad actual) {
        this.tiempoTranscurrido = new Tiempo();
        this.rango = rango;
        this.ciudadActual = actual;
        this.ordenDeArresto = new SinOrdenDeArresto();
        this.cantidadHeridasDeCuchillo = 0;
    }

    public LinkedList<Pista> visitar(Edificio unEdificio, Ladron ladron) {

        LinkedList<Pista> pistas = new LinkedList<>();
        pistas.add(this.rango.visitar(unEdificio, this.tiempoTranscurrido));
        pistas.add(this.rango.pedirPistaLadron(ladron));
        return pistas;
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

    public void arrestarA(Ladron unLadron) {
        if (unLadron.serArrestado(this.ordenDeArresto, this.ciudadActual)) {
            this.rango.sumarArresto();
        }
    }

    public void emitirOrdenDeArresto(OrdenArresto ordenDeArresto) {
        this.tiempoTranscurrido.sumarHoras(3);
        this.ordenDeArresto = ordenDeArresto;
    }

    public int cantidadArrestos() {
        return this.rango.cantidadArrestos();
    }

    //METODOs AUXILIARes PARA E2 C5.
    public void agregarArresto() {
        this.rango = this.rango.sumarArresto();
    }

    public boolean esInvestigador(){
        if(this.rango instanceof Investigador){
            return true;
        }
        return false;
    }

    public boolean esSargento(){
        if(this.rango instanceof Sargento){
            return true;
        }
        return false;
    }

    public boolean esDetective(){
        if(this.rango instanceof Detective){
            return true;
        }
        return false;
    }
}