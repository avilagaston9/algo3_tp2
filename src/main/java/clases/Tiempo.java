package clases;

public class Tiempo {

    private int horas;
    private boolean heridoConCuchillo;
    private int numeroVisita;

    public Tiempo() {

        this.horas = 0;
        this.heridoConCuchillo = false;
        this.numeroVisita = 1;
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

    public void sumarVisita() {

        if(this.numeroVisita > 3){

            this.sumarHoras(3);
            return;
        }
        this.sumarHoras(this.numeroVisita);
        this.numeroVisita++;
    }
}
