package clases;

public class Policia {
    private Ciudad ciudadActual;
    private int cantidadArrestos;
    private Tiempo tiempo;
    private Rango rango;

    public Policia(int arrestos, Ciudad montreal) {
        plazo= new Tiempo();
        rango= new Novato();
        cantidadArrestos=arrestos;
        ciudadActual=montreal;
    }

    public Pista visitar(Edificio unEdificio) {
        return null;
    }

    public void nuevaCiudad(Ciudad unaCiudad){
        ciudadActual = unaCiudad;
    }

    public void viajarA(Ciudad nuevaCiudad){
        ciudadActual.viajar(nuevaCiudad, tiempo, rango);
    }
}
