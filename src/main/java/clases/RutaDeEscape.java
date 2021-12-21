package clases;

import clases.ladron.Ladron;
import clases.valorObjetoRobado.*;

import java.util.ArrayList;

public class RutaDeEscape {

    private int largoRutaObjetoComun = 4;
    private int largoRutaObjetoValioso = 5;
    private int largoRutaObjetoMuyValioso = 7;


    private ArrayList<Ciudad> ciudades;

    public ArrayList<Ciudad> RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoComun objeto){

        this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoComun));
        return this.ciudades;
    }

    public ArrayList<Ciudad> RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoValioso objeto){

        this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoValioso));
        return this.ciudades;
    }

    public ArrayList<Ciudad> RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoMuyValioso objeto){

        this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoMuyValioso));
        return this.ciudades;
    }

    public void asignarUltimaCiudadA(Ladron ladron){
        ladron.setCiudad(this.ciudades.get(-1));
    }

}
