package clases;


public class Tatuaje implements CaracteristicaLadron {
    private Pista pista;

    public Tatuaje(){

        this.pista = new PistaConInformacion("Tiene un tatuaje de un dragon");
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
