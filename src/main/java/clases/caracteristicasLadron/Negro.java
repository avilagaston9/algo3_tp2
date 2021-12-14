package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Negro implements CaracteristicaLadron {
    private Pista pista;

    public Negro(){
        this.pista= new PistaConInformacion("Su pelo es negro");
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
