package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.Ciudad;
import clases.ObjetoRobado.ObjetoRobado;
import clases.ladron.Ladron;

import java.util.ArrayList;

public class ObtenerDatosFachada {

    private Lector lectorCiudades;
    private Lector lectorLadrones;
    private Lector lectorObjetosRobados;

    public ObtenerDatosFachada(Lector lectorCiudades, Lector lectorLadrones, Lector lectorObjetosRobados){
        this.lectorCiudades = lectorCiudades;
        this.lectorLadrones = lectorLadrones;
        this.lectorObjetosRobados = lectorObjetosRobados;
    }

    public ArrayList<Ciudad> obtenerCiudades(){
        return (ArrayList<Ciudad>) this.lectorCiudades.leer();
    }

    public ArrayList<Ladron> obtenerLadrones(){
        return (ArrayList<Ladron>) this.lectorLadrones.leer();
    }

    public ArrayList<ObjetoRobado> obtenerObjetosRobados(){
        return (ArrayList<ObjetoRobado>) this.lectorObjetosRobados.leer();
    }

}
