package clases;

public class PistaDificil extends Pista {
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
