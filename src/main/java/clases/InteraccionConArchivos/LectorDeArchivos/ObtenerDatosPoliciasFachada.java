package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.Policia;

import java.util.ArrayList;

public class ObtenerDatosPoliciasFachada {

    private Lector lector;

    public ObtenerDatosPoliciasFachada(Lector lector){
        this.lector = lector;
    }

    public ArrayList<Policia> obtenerPolicias(){

        return (ArrayList<Policia>) this.lector.leer();

    }

    /*


    metodo para escribir el archivo de policias



     */

}
