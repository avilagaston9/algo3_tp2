package clases;

public class Tiempo {
    private int horas;

    public Tiempo(){
        horas=10;
    }

    public int tiempo() {
        return horas;
    }

    public void restarTiempo(int hora) {
        horas-=hora;
    }
}
