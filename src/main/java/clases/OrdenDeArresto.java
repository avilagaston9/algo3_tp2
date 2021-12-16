package clases;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;

import java.util.LinkedList;

public class OrdenDeArresto implements OrdenArresto {

    private Ladron ladron;

    public OrdenDeArresto(Ladron delincuente){
        this.ladron = delincuente;
    }

    @Override
    public boolean comparar(Ladron ladron) {
        return this.ladron.equals(ladron);
    }


}

