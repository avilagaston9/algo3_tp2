package clases;


import java.util.HashMap;
import java.util.LinkedList;
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

        edificios = new LinkedList<Edificio>();
        nombre = nombreCiudad;
        this.distancias = new HashMap();
        visitas = 0;
    }

    public void agregarEdificio(Edificio unEdificio) {
        edificios.add(unEdificio);
    }

    public void agregarLadron(Ladron ladron) {

        this.ladron = ladron;
    }

    public void agregarSiguiente(Ciudad ciudadSiguiente, int distancia) {
        siguienteCiudad = ciudadSiguiente;
        distancias.put(ciudadSiguiente, distancia);
    }

    public void agregarAdyacente(Ciudad ciudadAdaycente, int distancia) {
        distancias.put(ciudadAdaycente, distancia);
    }


    public List<Pista> visitarEdificio (Edificio unEdificio, Rango rango, Tiempo tiempoTranscurrido){
        List<Pista> pistas = (edificios.get(edificios.indexOf(unEdificio))).serVisitado(this.siguienteCiudad, rango, tiempoTranscurrido, this.visitas);
        this.sumarVisita();
        return pistas;
    }



    public void sumarVisita() {
        this.visitas++;
    }

    public void agregarPistasBanco(Pistas pistas) {
        this.pistasBanco=pistas;
    }

    public void agregarPistasBiblioteca(Pistas pistas) {
        this.pistaBiblioteca=pistas;
    }

    public List<Pista> pistaBiblioteca(Rango rango) {
        return rango.pedirPista(this.pistaBiblioteca,this.ladron);
    }

    public List<Pista> pistaBanco(Rango rango) {
        return rango.pedirPista(this.pistasBanco,this.ladron);
    }

    public int distanciaEnKmsHasta(Ciudad unaCiudad) { return  (int)this.distancias.get(unaCiudad);  }
}

