package clases;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ciudad {

    private String nombre;
    private Ladron ladron;
    private Ciudad siguienteCiudad;
    private Map distancias;

    private List<Edificio> edificios;
    private int visitas;
    private Pistas pistasBanco;
    private Pistas pistaBiblioteca;
    private Pistas pistaAeropuerto;


    public Ciudad(String nombreCiudad) {
        edificios = null;
        nombre = nombreCiudad;
        Map distancias = new HashMap();

        visitas = 0;

    }

    public void agregarEdificio(Edificio banco) {
        edificios.add(banco);
    }

    public void agregarLadron(Ladron ladron) {
        ladron = ladron;
    }

    public void agregarSiguiente(Ciudad ciudadSiguiente, int distancia) {
        siguienteCiudad = ciudadSiguiente;
        distancias.put(ciudadSiguiente, distancia);
    }

    public void agregarAdyacente(Ciudad ciudadAdaycente, int distancia) {
        distancias.put(ciudadAdaycente, distancia);
    }


    public void viajar(Ciudad nuevaCiudad, Tiempo tiempo, Rango rango) {
        rango.viajar((Integer) distancias.get(nuevaCiudad), tiempo);

    }


    public List<Pista> visitarEdificio (Edificio unEdificio, Rango rango, Tiempo plazo){
        List<Pista> pistas = (edificios.get(edificios.indexOf(unEdificio))).serVisitado(this.siguienteCiudad, rango, plazo, this.visitas);
        this.sumarVisita();
        return pistas;
    }



    public void sumarVisita() {
        visitas++;
    }

    public void agregarPistasBanco(Pistas pistas) {
        pistasBanco=pistas;
    }

    public void agregarPistasBiblioteca(Pistas pistas) {
        pistaBiblioteca=pistas;
    }

    public List<Pista> pistaBiblioteca(Rango rango) {
        return rango.pedirPista(this.pistaBiblioteca,this.ladron);
    }

    public List<Pista> pistaBanco(Rango rango) {
        return rango.pedirPista(this.pistasBanco,this.ladron);
    }
}

