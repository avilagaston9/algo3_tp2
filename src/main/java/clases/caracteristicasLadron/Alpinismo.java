package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Alpinismo implements CaracteristicaLadron {
    private Pista pista;

    public Alpinismo(){
        this.pista=new PistaConInformacion("le gusta escalar montañas");
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
