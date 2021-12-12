package clases;

import java.util.List;

public interface Edificio {
    public void agregarPista(String caracteristica,Rango rango);
    public Pista serVisitado(Edificio edificio,Ciudad siguienteCiudad,Tiempo tiempo,int visitas);

    Pista darPista();

    public boolean sosIgual(Edificio edificio);

    String tipo();
}
