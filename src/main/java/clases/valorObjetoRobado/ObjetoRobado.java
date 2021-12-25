package clases.valorObjetoRobado;

import clases.Ciudad;
import clases.RutaDeEscape;
import clases.rangos.*;

import java.util.ArrayList;

public abstract class ObjetoRobado {

    private String nombreCiudad;
    private int largoRutaDeEscape;

    public abstract boolean esValidoPara(Novato rango);

    public abstract boolean esValidoPara(Detective rango);

    public abstract boolean esValidoPara(Investigador rango);

    public abstract boolean esValidoPara(Sargento rango);

    public abstract RutaDeEscape crearRutaDeEscape(ArrayList<Ciudad> ciudades);
}
