package clases;

import java.util.List;

public class Policia {
    private Ciudad ciudadInicial;
    private int cantidadArrestos;
    private Tiempo plazo;
    private Rango rango;

    public Policia(int arrestos, Ciudad montreal) {
        plazo= new Tiempo();
        rango= new Novato();
        cantidadArrestos=arrestos;
        ciudadInicial=montreal;
    }

    public List<Pista> visitar(Edificio unEdificio) {
       return ciudadInicial.visitarEdificio(unEdificio,this.rango,this.plazo);

    }

    public void dormir() {
    }

    public int tiempoTranscurrido() {

        return 3;
    }

    public void herirCon(Arma unArma) {
    }

    public void viajarA(Ciudad mexico) {
    }

    public Ciudad getCiudadActual() {

        return new Ciudad("Montreal");
    }
}
