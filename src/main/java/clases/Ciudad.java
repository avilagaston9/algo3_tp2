package clases;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ciudad {

<<<<<<< HEAD
    private List edificios;
    private String nombre;
    private Ladron ladron;
    private Ciudad siguienteCiudad;
    private Map distancias;
=======
    private List <Edificio> edificios;
    private String nombre;
    private Ladron ladron;
    private Ciudad siguienteCiudad;
    private int visitas;
    private Pistas pistasBanco;
>>>>>>> 631b5a4cd574a7d45e4df49956e1d7519310d49a

    public Ciudad(String nombreCiudad){
        edificios=null;
        nombre = nombreCiudad;
<<<<<<< HEAD
        Map distancias = new HashMap();
=======
        visitas=0;
>>>>>>> 631b5a4cd574a7d45e4df49956e1d7519310d49a
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

<<<<<<< HEAD
    public void viajar(Ciudad nuevaCiudad, Tiempo tiempo, Rango rango){
        rango.viajar((Integer) distancias.get(nuevaCiudad), tiempo);
=======
    public void agregarPistasBanco(Pistas unasPistas) {
        pistasBanco=unasPistas;
    }

    public Pista visitarEdificio(Edificio unEdificio, Rango rango, Tiempo plazo) {
        return (edificios.get(edificios.indexOf(unEdificio))).serVisitado(this.siguienteCiudad,rango,plazo,this.visitas);
    }

    public Pistas pistaBanco(Rango rango) {
        return rango.pedirPista(this.pistasBanco,this.ladron);
>>>>>>> 631b5a4cd574a7d45e4df49956e1d7519310d49a
    }
}
