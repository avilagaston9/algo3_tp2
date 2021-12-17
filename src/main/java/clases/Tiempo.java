package clases;

import clases.armas.Cuchillo;

import clases.rangos.*;

public class Tiempo {

    private int horas;
    private boolean heridoConCuchillo;
    private int numeroVisita;

    public Tiempo() {

        this.horas = 0;
        this.heridoConCuchillo = false;
        this.numeroVisita = 1;
    }

    private int calcularHorasConsumidas(int kilometros, int costoFijo){
        this.numeroVisita = 1;
        return (kilometros/costoFijo);
    }

    public void sumarHoras(int cantidad){this.horas+=cantidad;}

    public int tiempoTranscurridoEnHoras(){
        return this.horas;
    }


    public void dormir() {

        sumarHoras(8);
    }

    public void sumarVisita() {

        if(this.numeroVisita > 3){

            this.sumarHoras(3);
            return;
        }
        this.sumarHoras(this.numeroVisita);
        this.numeroVisita++;
    }

    public void herirCon(Cuchillo cuchillo) {

        if(this.heridoConCuchillo){

            this.sumarHoras(1);
            return;
        }
        this.heridoConCuchillo = true;
        this.sumarHoras(2);
    }

    public void viajar(int kilometros, Novato unRango){
        this.sumarHoras(calcularHorasConsumidas(kilometros, 900));
    }

    public void viajar(int kilometros, Detective unRango){
        this.sumarHoras(calcularHorasConsumidas(kilometros, 1100));
    }

    public void viajar(int kilometros, Investigador unRango){
        this.sumarHoras(calcularHorasConsumidas(kilometros, 1300));
    }

    public void viajar(int kilometros, Sargento unRango){
        this.sumarHoras(calcularHorasConsumidas(kilometros, 1500));
    }

}
