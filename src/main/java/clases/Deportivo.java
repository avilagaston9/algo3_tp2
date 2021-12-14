package clases;

public class Deportivo implements CaracteristicaLadron {
    private Pista pista;

    public Deportivo(){
        this.pista=new PistaConInformacion("se movia en un deportivo");
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
