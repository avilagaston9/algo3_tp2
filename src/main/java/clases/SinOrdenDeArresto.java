package clases;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;

import java.util.LinkedList;

public class SinOrdenDeArresto implements OrdenArresto {

    @Override
    public boolean comparar(Ladron ladron) {
        return false;
    }

}
