package clases;

import clases.rangos.Rango;

public class PoliciaBuilder {

    private Ciudad ciudadInicio;
    private Rango rango;
    private RutaDeEscape rutaDeEscape;

    public void setUltimaCiudad(RutaDeEscape rutaDeEscape) {
        this.ciudadInicio = rutaDeEscape.getPrimerCiudad();
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public Policia getPolicia(){
        return new Policia(this.rango, this.ciudadInicio);
    }
}
