package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;
import edu.fiuba.algo3.modelo.Policia.Policia;
import edu.fiuba.algo3.modelo.ladron.Ladron;

import java.util.ArrayList;

public class ObtenerDatosFachada {

    private Lector lectorCiudades;
    private Lector lectorLadrones;
    private Lector lectorObjetosRobados;
    private Lector lectorPolicias;

    public ObtenerDatosFachada(Lector lectorCiudades, Lector lectorLadrones, Lector lectorObjetosRobados, Lector lectorPolicias){
        this.lectorCiudades = lectorCiudades;
        this.lectorLadrones = lectorLadrones;
        this.lectorObjetosRobados = lectorObjetosRobados;
        this.lectorPolicias = lectorPolicias;
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

    public ArrayList<Policia> obtenerPolicias(){
        return (ArrayList<Policia>) this.lectorPolicias.leer();
    }

}
