package clases;

import java.util.LinkedList;
import java.util.List;

public class Novato implements Rango {

    public Novato(){
    }

    @Override
    public List <Pista> pedirPista(Pistas pistasEdificio, Ladron ladron) {

        List <Pista> pistasDevueltas = new LinkedList<Pista>();
        pistasDevueltas.add(0,pistasEdificio.pistaFacil());
        pistasDevueltas.add(1,ladron.darPista());
        return pistasDevueltas;
    }


    @Override
    public void viajar(int cantidadKms, Tiempo tiempo){
        tiempo.sumarHoras(cantidadKms*1/900);
    }




}
