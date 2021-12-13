package clases;

public class PistaSinInformacion implements Pista {
    private String pista;

    @Override
    public void agregarCaracteristica(String caracteristica) {

        this.pista = caracteristica;
    }

    @Override
    public String revelar() {
        return this.pista;
    }
}
