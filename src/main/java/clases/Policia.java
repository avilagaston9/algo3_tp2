package clases;

import java.util.List;

public class Policia {
    private Ciudad ciudadActual;
    private int cantidadArrestos;
    private Tiempo tiempoTranscurrido;
    private Rango rango;

    public Policia(Rango rango, Ciudad actual) {
        this.tiempoTranscurrido= new Tiempo();
        this.rango=rango;
        this.cantidadArrestos=0;
        this.ciudadActual=actual;
    }

    public Pista visitar(Edificio unEdificio) {
       return ciudadActual.visitarEdificio(unEdificio,this.tiempoTranscurrido);

    }

    public void dormir() {

        this.rango.dormir(this.tiempoTranscurrido);
    }

    public int tiempoTranscurridoEnHoras() {

        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
    }

    public void herirCon(Arma unArma) {

        unArma.Herir(this.tiempoTranscurrido);
    }

    public void viajarA(Ciudad nuevaCiudad) {

        int kilometros = this.ciudadActual.distanciaEnKmsHasta(nuevaCiudad);
        this.rango.viajar(kilometros, this.tiempoTranscurrido);
        setCiudadActual(nuevaCiudad);
    }

    public void setCiudadActual(Ciudad unaCiudad){

        this.ciudadActual = unaCiudad;
    }

    public boolean esCiudadActual(Ciudad unaCiudad) {

        return unaCiudad == this.ciudadActual;
    }

    public int tiempoTranscurrido() {
        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
    }
}
