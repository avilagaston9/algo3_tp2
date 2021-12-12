package clases;

public class Tiempo {
    private int horas;

    public Tiempo(){
        this.horas = 0;
    }

    public void sumarHoras(int cantidad){
        this.horas+=cantidad;
    }

    public int tiempoTranscurridoEnHoras(){
        return this.horas;
    }


    public void dormir() {

        sumarHoras(8);
    }
}
