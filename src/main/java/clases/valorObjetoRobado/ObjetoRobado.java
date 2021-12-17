package clases.valorObjetoRobado;

import clases.Ciudad;
import clases.rangos.*;

import java.util.ArrayList;

public class ObjetoRobado {

    private int largoRuta;

    public ObjetoRobado(Novato rango){
        this.largoRuta = 4;
    }

    public ObjetoRobado(Detective rango){
        this.largoRuta = 5;
    }
    public ObjetoRobado(Investigador rango){
        this.largoRuta = 7;
    }
    public ObjetoRobado(Sargento rango){
        this.largoRuta = 7;
    }

    public ArrayList<Ciudad> crearRutaDeEscape(ArrayList<Ciudad> ciudades){
        return (ArrayList<Ciudad>) (new ArrayList<Ciudad>(ciudades)).subList(0,this.largoRuta);
    }

}
