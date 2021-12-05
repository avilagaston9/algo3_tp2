package clases;

public class Banco implements Edificio {
    private Pista pista;

    @Override
    public Pista serVisitado(Detective detective) {
        detective.restarTiempo(1);
        return pista;
    }
}
