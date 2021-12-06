package clases;

public class Detective {
    private Tiempo plazo;
    private String grado;
    private Ciudad ciudadActual;

    public Detective(Ciudad ciudad) {
        //plazo=null;
        ciudadActual = ciudad;
    }

    public void establecerRango(String rango){
        grado=rango;
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
