package clases;

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

    public Pista visitar(Edificio unEdificio) {
        return null;
    }
}
