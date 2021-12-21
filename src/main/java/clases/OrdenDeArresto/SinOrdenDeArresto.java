package clases.OrdenDeArresto;

import clases.ladron.Ladron;

public class SinOrdenDeArresto implements OrdenArresto {

    @Override
    public boolean comparar(Ladron ladron) {
        return false;
    }

}
