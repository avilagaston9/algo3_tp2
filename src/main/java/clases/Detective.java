package clases;

public class Detective {
    private Tiempo plazo;

    public Detective() {
        plazo=null;
    }

    public void asignarHoras(Tiempo horas) {
        plazo=horas;
    }

    public int tiempoRestante() {
        return plazo.tiempo();
    }

    public void restarTiempo(int hora) {
        plazo.restarTiempo(hora);
    }
}
