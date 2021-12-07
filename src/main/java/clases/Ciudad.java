package clases;


import java.util.List;

public class Ciudad {

    private List <Edificio> edificios;
    private String nombre;
    private Ladron ladron;
    private Ciudad siguienteCiudad;
    private int visitas;
    private Pistas pistasBanco;
    private Pistas pistaBiblioteca;
    private Pistas pistaAeropuerto;

    public Ciudad(String nombreCiudad){
        edificios=null;
        nombre = nombreCiudad;
        visitas=0;
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


    public void agregarPistasBanco(Pistas unasPistas) {
        pistasBanco=unasPistas;
    }


    public List visitarEdificio(Edificio unEdificio, Rango rango, Tiempo plazo) {
        List pistas = (edificios.get(edificios.indexOf(unEdificio))).serVisitado(this.siguienteCiudad,rango,plazo,this.visitas);
        this.sumarVisita();
        return pistas;
    }

    private void sumarVisita() {
        visitas++;
    }

    public List pistaBanco(Rango rango) {
        return rango.pedirPista(this.pistasBanco,this.ladron);
    }

    public void agregarPistasBiblioteca(Pistas unasPistas) {pistaBiblioteca=unasPistas;}

    public List pistaBiblioteca(Rango rango) {return rango.pedirPista(this.pistaBiblioteca,this.ladron);}

}
