package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Anillo implements CaracteristicaLadron {
    private Pista pista;

    public Anillo(){
        this.pista= new PistaConInformacion("llevaba puesto un anillo");
    }

    @Override
    public Pista darPista() {
        return pista;
    }

    @Override
    public boolean equals(CaracteristicaLadron caracteristica) {
        return this.pista.revelar().equals(caracteristica.darPista().revelar());
    }
}
