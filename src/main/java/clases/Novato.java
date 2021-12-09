package clases;

import java.util.List;

public class Novato implements Rango {
    private List <Pista> pistasDevueltas;

    public Novato(){
    }

    @Override
    public List <Pista> pedirPista(Pistas pistasEdificios, Ladron ladron) {
        pistasDevueltas.add(0,pistasEdificios.pistaFacil());
        pistasDevueltas.add(1,ladron.darPista());
        return pistasDevueltas;
    }


    @Override
    public void viajar(int cantidadKms, Tiempo tiempo){
        tiempo.sumarHoras(cantidadKms*1/900);
    }




}
