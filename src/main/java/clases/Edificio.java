package clases;

import java.util.List;

public interface Edificio {
    List<Pista> serVisitado(Ciudad siguienteCiudad, Rango rango, Tiempo plazo, int visitas);
}
