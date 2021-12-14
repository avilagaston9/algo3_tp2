package clases.caracteristicasLadron;


import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

public class Rubio implements CaracteristicaLadron {
    private Pista pista;


    public Rubio(){
        this.pista = new PistaConInformacion("Tiene pelo amarillo");
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
