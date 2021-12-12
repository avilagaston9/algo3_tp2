package clases;

public class PistaFacil implements Pista {
    private String descripcion;

    public PistaFacil(){}

    @Override
    public void agregarCaracteristica(String caracteristica) {
        this.descripcion=caracteristica;

    }

    @Override
    public String revelar() {
        return descripcion;
    }
}
