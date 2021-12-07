package clases;


import java.util.List;

public class Ciudad {

    public List edificios;
    public String nombre;
    public Ladron ladron;
    public Ciudad siguienteCiudad;

    public Ciudad(String nombreCiudad){
        edificios=null;
        nombre = nombreCiudad;
    }

    public void agregarEdificio(Edificio banco) {
        edificios.add(banco);
    }

    public void agregarLadron(Ladron ladron){
        ladron = ladron;
    }

    public void agregarSiguiente(Ciudad ciudadSiguiente, int distancia){
        siguienteCiudad= ciudadSiguiente;
    }


}
