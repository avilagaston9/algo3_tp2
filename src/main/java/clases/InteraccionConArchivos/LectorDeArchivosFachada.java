package clases.InteraccionConArchivos;

import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivos;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;

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

    public List<Ciudad> obtenerCiudades(String pathArchivoCiudades) {
        
        return this.lectorArchivoCiudades.leer(pathArchivoCiudades);
    }
    public List<Ladron> obtenerLadrones(String pathArchivoLadrones) {

        return this.lectorArchivoLadrones.leer(pathArchivoLadrones);
    }
    public List<ObjetoRobado> obtenerObjetosRobados(String pathArchivoObjetosRobados) {

        return this.lectorArchivoObjetosRobados.leer(pathArchivoObjetosRobados);
    }

    //...

}
