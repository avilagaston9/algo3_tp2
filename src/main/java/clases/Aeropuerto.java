package clases;

import java.util.List;

public class Aeropuerto implements Edificio {
    @Override
    public List<Pista> serVisitado(Ciudad siguienteCiudad, Rango rango, Tiempo plazo, int visitas) {
        return siguienteCiudad.pistaAeropuerto(rango);
    }
}
