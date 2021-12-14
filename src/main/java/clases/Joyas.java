package clases;

public class Joyas implements CaracteristicaLadron {
    private Pista pista;

    public  Joyas(){
        this.pista= new PistaConInformacion("usaba muchas joyas");
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
