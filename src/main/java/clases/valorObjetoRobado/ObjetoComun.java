package clases.valorObjetoRobado;

import clases.Ciudad;
import clases.RutaDeEscape;
import clases.rangos.*;

import java.util.ArrayList;

public class ObjetoComun extends ObjetoRobado{

    private String nombreCiudad;
    private int largoRutaDeEscape;

    public ObjetoComun(){
        this.largoRutaDeEscape = 4;
    }

    @Override
    public boolean esValidoPara(Novato rango){
        return true;
    }

    @Override
    public boolean esValidoPara(Detective rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Investigador rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Sargento rango){
        return false;
    }

    @Override
    public RutaDeEscape crearRutaDeEscape(ArrayList<Ciudad> ciudades) {
        return new RutaDeEscape(ciudades, this.nombreCiudad, this.largoRutaDeEscape);
    }
}
