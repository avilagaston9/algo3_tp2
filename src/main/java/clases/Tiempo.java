package clases;

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
        numeroVisita = 0;
        return (kilometros/costoFijo);
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

    public int viajar(int kilometros, Novato unRango){
        return (calcularHorasConsumidas(kilometros, 900));
    }

    public int viajar(int kilometros, Detective unRango){
        return (calcularHorasConsumidas(kilometros, 1100));
    }

    public int viajar(int kilometros, Investigador unRango){
        return (calcularHorasConsumidas(kilometros, 1300));
    }

    public int viajar(int kilometros, Sargento unRango){
        return (calcularHorasConsumidas(kilometros, 1500));
    }

}
