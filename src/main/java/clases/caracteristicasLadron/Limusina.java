package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Limusina implements CaracteristicaLadron {
    private Pista pista;

    public Limusina(){
        this.pista=new PistaConInformacion("se movia en una limusina");
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
