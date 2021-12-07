package clases;

public class Novato implements Rango {
    private Pistas pistasDevueltas;

    public Novato(){
    }

    @Override
    public Pistas pedirPista(Pistas pistasBanco, Ladron ladron) {
        pistasDevueltas.agregarPistaFacil(pistasBanco.pistaFacil());
        pistasDevueltas.agregarPistaLadron(ladron.darPista());
        return pistasDevueltas;
    }
    @Override
    public void viajar(int cantidadKms, Tiempo tiempo){
        tiempo.restarHoras(cantidadKms*1/900);
    }




}
