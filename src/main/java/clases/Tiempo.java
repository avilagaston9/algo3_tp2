package clases;

public class Tiempo {

    private int horas;
    private boolean heridoConCuchillo;

    public Tiempo() {

        this.horas = 0;
        this.heridoConCuchillo = false;
    }

    public void sumarHoras(int cantidad){this.horas+=cantidad;}

    public int tiempoTranscurridoEnHoras(){
        return this.horas;
    }


    public void dormir() {

        sumarHoras(8);
    }

    public void heridaDeCuchillo() {

        if(this.heridoConCuchillo){

            this.sumarHoras(1);
            return;
        }
        heridoConCuchillo = true;
        this.sumarHoras(2);
    }
}
