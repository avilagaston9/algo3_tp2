package clases;

import clases.caracteristicasLadron.CaracteristicaLadron;

import java.util.LinkedList;

public class SinOrdenDeArresto implements OrdenArresto {
    @Override
    public boolean comparar(LinkedList<CaracteristicaLadron> caracteristicas) {
        return false;
    }

}
