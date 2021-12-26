package clases.InteraccionConArchivos;

import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivos;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;

import java.util.ArrayList;
import java.util.List;

public class LectorDeArchivosFachada {

    private LectorArchivos lectorArchivoLadrones;
    private LectorArchivos lectorArchivoCiudades;
    private LectorArchivos lectorArchivoObjetosRobados;

    public LectorDeArchivosFachada(){

        this.lectorArchivoCiudades = new LectorArchivoCiudades();
        this.lectorArchivoLadrones = new LectorArchivoLadrones();
        this.lectorArchivoObjetosRobados = new LectorArchivoObjetosRobados();
    }

    /*
    public Ladron obtenerLadron(){
        Ladron ladron = lector.obtenerLadron();
        return ladron;
    }
     */

    public ArrayList<Ciudad> obtenerCiudades(String pathArchivoCiudades) {
        
        return (ArrayList<Ciudad>) this.lectorArchivoCiudades.leer(pathArchivoCiudades);
    }
    public ArrayList<Ladron> obtenerLadrones(String pathArchivoLadrones) {

        return (ArrayList<Ladron>) this.lectorArchivoLadrones.leer(pathArchivoLadrones);
    }
    public ArrayList<ObjetoRobado> obtenerObjetosRobados(String pathArchivoObjetosRobados) {

        return (ArrayList<ObjetoRobado>) this.lectorArchivoObjetosRobados.leer(pathArchivoObjetosRobados);
    }

    //...

}
