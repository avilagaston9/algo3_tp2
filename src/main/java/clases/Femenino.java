package clases;


public class Femenino implements CaracteristicaLadron {
    private Pista pista;

    public Femenino(){

        this.pista = new PistaConInformacion("Es mujer");
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
