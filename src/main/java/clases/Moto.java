package clases;


public class Moto implements CaracteristicaLadron {
    private Pista pista;

    public Moto(){

        this.pista = new PistaConInformacion("Se mueve en moto");
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
