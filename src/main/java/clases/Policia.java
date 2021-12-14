package clases;

import java.util.LinkedList;
import java.util.List;

public class Policia {
    private Ciudad ciudadActual;
    private Tiempo tiempoTranscurrido;
    private Rango rango;
    private OrdenArresto ordenDeArresto=new SinOrdenDeArresto();

    public Policia(Rango rango, Ciudad actual) {
        this.tiempoTranscurrido= new Tiempo();
        this.rango=rango;
        this.ciudadActual=actual;
    }

    public LinkedList<Pista> visitar(Edificio unEdificio, Ladron ladron) {

        LinkedList<Pista> pistas = new LinkedList<>();
        pistas.add(this.rango.visitar(unEdificio));
        pistas.add(this.rango.pedirPistaLadron(ladron));
        return pistas;
    }

    public void dormir() { this.tiempoTranscurrido.dormir(); }

    public int tiempoTranscurridoEnHoras() {

        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
    }

    public void herirCon(Arma unArma) {  unArma.Herir(this.tiempoTranscurrido);  }

    /*
    public void viajarA(Ciudad nuevaCiudad) {

        int kilometros = this.ciudadActual.distanciaEnKmsHasta(nuevaCiudad);
        this.rango.viajar(kilometros, this.tiempoTranscurrido);
        setCiudadActual(nuevaCiudad);
    }
    */

    public void setCiudadActual(Ciudad unaCiudad){

        this.ciudadActual = unaCiudad;
    }

    public boolean esCiudadActual(Ciudad unaCiudad) {

        return unaCiudad == this.ciudadActual;
    }

    public int tiempoTranscurrido() {
        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
    }

    public boolean arrestarA(Ladron maria) {
        return maria.verOrden(this.ordenDeArresto);
    }
}
