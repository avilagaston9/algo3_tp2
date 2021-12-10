package clases;

public class Ladron {
    private String nombre;
    private Pista pista;

    ///cambiar
    public Ladron(String unNombre) {

        this.pista = new Pista(unNombre);
    }

    public Pista darPista() {
        return pista;
    }
}
