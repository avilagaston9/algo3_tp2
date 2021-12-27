package clases.valorObjetoRobado;

import clases.Ciudad;
import clases.RutaDeEscape;
import clases.rangos.*;
import java.util.List;

public class ObjetoValioso extends ObjetoRobado{


    public ObjetoValioso(){
        this.largoRutaDeEscape = 5;
    }

    @Override
    public boolean esValidoPara(Novato rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Detective rango){
        return true;
    }

    @Override
    public boolean esValidoPara(Investigador rango){
        return true;
    }

    @Override
    public boolean esValidoPara(Sargento rango){
        return false;
    }

    @Override
    public RutaDeEscape crearRutaDeEscape(List<Ciudad> ciudades) {
        return new RutaDeEscape(ciudades, this.nombreCiudad, this.largoRutaDeEscape);
    }
}
