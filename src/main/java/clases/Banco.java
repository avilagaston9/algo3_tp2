package clases;

public class Banco implements Edificio {
    @Override
    public Pista serVisitado(Ciudad siguienteCiudad, Rango rango, Tiempo plazo, int visitas) {
        return siguienteCiudad.pistaBanco(rango);

    }
}
