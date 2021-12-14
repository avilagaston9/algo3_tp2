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
    private Coordenadas coordenadas;

    public Ciudad(String nombreCiudad) {

        edificios = new LinkedList<Edificio>();
        nombre = nombreCiudad;
        this.distancias = new HashMap();
        visitas = 0;
    }
    /*

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


    public Pista visitarEdificio (Edificio unEdificio,Tiempo tiempoTranscurrido){
        Pista pista = (edificios.get(edificios.indexOf(unEdificio))).serVisitado(unEdificio,this.siguienteCiudad,tiempoTranscurrido,this.visitas);
        this.sumarVisita();
        return pista;
    }

    public void sumarVisita() {
        this.visitas++;
    }

    public int distanciaEnKmsHasta(Ciudad unaCiudad) { return  (int)this.distancias.get(unaCiudad);  }

    public Pista darPistaDe(Edificio edificio) {
        for (int i=0;i< edificios.size();i++){
            if(edificios.get(i).sosIgual(edificio)){
                return edificios.get(i).darPista();
            }
        }
        return null;
    }

     */

    public double calcularDistancia(Ciudad otraCiudad){
        return otraCiudad.calcularDistancia(this.coordenadas);
    }

    protected double calcularDistancia(Coordenadas otrasCoordenadas){
        return otrasCoordenadas.calcularDistancia(this.coordenadas);
    }
}

