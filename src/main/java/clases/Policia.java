package clases;

public class Policia {
    private Ciudad ciudadActual;
    private int cantidadArrestos;
    private Tiempo plazo;
    private Rango rango;

    public Policia(int arrestos, Ciudad montreal) {
        plazo= new Tiempo();
        rango= new Novato();
        cantidadArrestos=arrestos;
        ciudadActual=montreal;
    }

    public Pista visitar(Edificio unEdificio) {
       return ciudadActual.visitarEdificio(unEdificio,this.rango,this.plazo);
    }

    public int tiempoTranscurrido(){
        return plazo.getHoras();
    }

    public void nuevaCiudad(Ciudad unaCiudad){
        ciudadActual = unaCiudad;
    }

    public void viajarA(Ciudad nuevaCiudad){
        ciudadActual.viajar(nuevaCiudad, plazo, rango);
    }
}
