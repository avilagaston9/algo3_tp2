package clases;

public class PistaMedia extends Pista {
    private String descripcion;
    @Override
    public void agregarCaracteristica(String caracteristica) {
        this.descripcion=caracteristica;
    }

    @Override
    public String revelar() {
        return descripcion;
    }
}
