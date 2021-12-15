package clases;


public class Ciudad {

    private String nombre;
    private Coordenadas coordenadas;

    public Ciudad(String nombreCiudad, Coordenadas coordenadas) {

        this.nombre = nombreCiudad;
        this.coordenadas = coordenadas;
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


    public Pista darPistaDe(Edificio edificio) {
        for (int i=0;i< edificios.size();i++){
            if(edificios.get(i).sosIgual(edificio)){
                return edificios.get(i).darPista();
            }
        }
        return null;
    }

     */

    public double calcularDistanciaEnKms(Ciudad otraCiudad){

        return otraCiudad.calcularDistanciaEnKms(this.coordenadas);
    }

    protected double calcularDistanciaEnKms(Coordenadas otrasCoordenadas){
        return otrasCoordenadas.calcularDistancia(this.coordenadas);
    }
}

