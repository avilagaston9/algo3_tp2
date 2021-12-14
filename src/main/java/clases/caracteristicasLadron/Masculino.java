package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Masculino implements CaracteristicaLadron {
    private Pista pista;

    public Masculino(){
        this.pista= new PistaConInformacion("es hombre");
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
