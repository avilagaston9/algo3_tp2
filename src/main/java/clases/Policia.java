package clases;

import java.util.List;

public class Policia {
    private Ciudad ciudadInicial;
    private int cantidadArrestos;
    private Tiempo tiempoTranscurrido;
    private Rango rango;

    public Policia(int arrestos, Ciudad montreal) {
        tiempoTranscurrido= new Tiempo();
        rango= new Novato();
        cantidadArrestos=arrestos;
        ciudadInicial=montreal;
    }

    public List<Pista> visitar(Edificio unEdificio) {
       return ciudadInicial.visitarEdificio(unEdificio,this.rango,this.tiempoTranscurrido);

    }

    public void dormir() {
    }

    public int tiempoTranscurridoEnHoras() {

        return this.tiempoTranscurrido.tiempoTranscurridoEnHoras();
    }

    public void herirCon(Arma unArma) {
    }

    public void viajarA(Ciudad mexico) {
    }

    public Ciudad getCiudadActual() {

        return new Ciudad("Montreal");
    }
}
