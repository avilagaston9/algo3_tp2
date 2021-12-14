package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Tenis implements CaracteristicaLadron {
    private Pista pista;

    public Tenis(){
        this.pista = new PistaConInformacion("Su hobby es jugar al tenis");
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
