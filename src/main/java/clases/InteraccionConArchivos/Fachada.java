package clases.InteraccionConArchivos;

import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivos;
import clases.ladron.Ladron;

public class Fachada {

    private LectorArchivos lector;

    public Fachada(LectorArchivos unLector){
        this.lector = unLector;
    }

    public Ladron obtenerLadron(){
        Ladron ladron = lector.obtenerLadron();
        return ladron;
    }

    //...

}
