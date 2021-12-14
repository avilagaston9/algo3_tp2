package clases.caracteristicasLadron;

import clases.pistas.Pista;

public interface CaracteristicaLadron {
    public Pista darPista();

    boolean equals(CaracteristicaLadron caracteristica);
}
