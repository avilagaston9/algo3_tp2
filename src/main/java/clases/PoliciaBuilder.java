package clases;

import clases.rangos.Rango;

public class PoliciaBuilder {

    private Ciudad ciudadInicio;
    private Rango rango;
    private RutaDeEscape rutaDeEscape;

    public void setUltimaCiudad(RutaDeEscape rutaDeEscape) {
        this.ciudadInicio = ;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public Policia getPolicia(){
        Policia policia = new Policia(this.rango);
        rutaDeEscape.asignarCiudad(policia);
        return policia;
    }
}
