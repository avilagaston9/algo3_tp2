package clases;


import java.util.List;

public class Ciudad {

    private List <Edificio> edificios;
    private String nombre;
    private Ladron ladron;
    private Ciudad siguienteCiudad;
    private int visitas;
    private Pistas pistasBanco;

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

    public Pista visitarEdificio(Edificio unEdificio, Rango rango, Tiempo plazo) {
        return (edificios.get(edificios.indexOf(unEdificio))).serVisitado(this.siguienteCiudad,rango,plazo,this.visitas);
    }

    public Pistas pistaBanco(Rango rango) {
        return rango.pedirPista(this.pistasBanco,this.ladron);
    }
}
