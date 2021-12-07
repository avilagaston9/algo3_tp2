package clases;

import java.util.List;

public class Biblioteca implements Edificio {
    @Override
    public List serVisitado(Ciudad siguienteCiudad, Rango rango, Tiempo plazo, int visitas) {
        return siguienteCiudad.pistaBiblioteca(rango);
    }
}
