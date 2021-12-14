package clases;

public class Musica implements CaracteristicaLadron {
    private Pista pista;

    public Musica(){
        this.pista=new PistaConInformacion("le gusta escuchar musica");
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
