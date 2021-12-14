package clases;

import clases.caracteristicasLadron.CaracteristicaLadron;

import java.util.LinkedList;

public interface OrdenArresto {
    boolean comparar(LinkedList<CaracteristicaLadron> caracteristicas);

}
