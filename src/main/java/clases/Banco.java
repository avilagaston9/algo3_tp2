package clases;

import java.util.List;

public class Banco implements Edificio {
    @Override
    public List<Pista> serVisitado(Ciudad siguienteCiudad, Rango rango, Tiempo plazo, int visitas) {
        return siguienteCiudad.pistaBanco(rango);

    }
}
