package clases;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ciudad {

    private List edificios;
    private String nombre;
    private Ladron ladron;
    private Ciudad siguienteCiudad;
    private Map distancias;

    public Ciudad(String nombreCiudad){
        edificios=null;
        nombre = nombreCiudad;
        Map distancias = new HashMap();
    }

    public void agregarEdificio(Edificio banco) {
        edificios.add(banco);
    }

    public void agregarLadron(Ladron ladron){
        ladron = ladron;
    }

    public void agregarSiguiente(Ciudad ciudadSiguiente, int distancia){
        siguienteCiudad= ciudadSiguiente;
        distancias.put(ciudadSiguiente, distancia);
    }

    public void agregarAdyacente(Ciudad ciudadAdaycente, int distancia){
        distancias.put(ciudadAdaycente, distancia);
    }

    public void viajar(Ciudad nuevaCiudad, Tiempo tiempo, Rango rango){
        rango.viajar(distancias.get(nuevaCiudad), tiempo);
    }
}
