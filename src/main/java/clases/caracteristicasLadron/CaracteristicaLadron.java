package clases.caracteristicasLadron;

import clases.pistas.Pista;

public interface CaracteristicaLadron { //todo esto tiene que ser una clase concreta, que reciba en su constructor la caracteristica (texto)...
    public Pista darPista();

    boolean equals(CaracteristicaLadron caracteristica);

    //todo chequear que la poista que se obtiene pertenzca a la coleccion de pistas correcta.
}
