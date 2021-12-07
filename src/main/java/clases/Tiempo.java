package clases;

public class Tiempo {
    private int horas;

    public Tiempo(){
        horas = 0;
    }

    public void sumarHoras(int cantidad){
        horas+=cantidad;
    }

    public int getHoras(){
        return horas;
    }



}
