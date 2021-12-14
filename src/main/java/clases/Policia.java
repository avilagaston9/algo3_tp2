package clases;

import clases.armas.Arma;
import clases.Ciudad;
import clases.Ladron;
import clases.Tiempo;
import clases.edificios.Edificio;
import clases.pistas.Pista;
import clases.rangos.Rango;

import java.util.LinkedList;

public class Policia {
    private Ciudad ciudadActual;
    private Tiempo tiempoTranscurrido;
    private Rango rango;

    public Policia(Rango rango, Ciudad actual) {
        this.tiempoTranscurrido= new Tiempo();
        this.rango=rango;
        this.ciudadActual=actual;
    }

    public LinkedList<Pista> visitar(Edificio unEdificio, Ladron ladron) {

        LinkedList<Pista> pistas = new LinkedList<>();
        pistas.add(this.rango.visitar(unEdificio, this.tiempoTranscurrido));
        pistas.add(this.rango.pedirPistaLadron(ladron));
        return pistas;
    }

<<<<<<< HEAD
    public int tiempoTranscurridoEnHoras(){
        return plazo.getHoras();
=======
    public void dormir() { this.tiempoTranscurrido.dormir(); }

    public int tiempoTranscurridoEnHoras() {

        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
>>>>>>> 3045364757e6e84e02fcf1f98fd474f965e4e92d
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

<<<<<<< HEAD
    public boolean ciudadActual(Ciudad ciudad){
        if (ciudadActual == ciudad){
            return true;
        }
        return false;
=======
    public int tiempoTranscurrido() {
        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
>>>>>>> 3045364757e6e84e02fcf1f98fd474f965e4e92d
    }
}
