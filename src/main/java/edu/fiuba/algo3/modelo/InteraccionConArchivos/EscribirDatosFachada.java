package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.Policia;

public class EscribirDatosFachada {

    private Escritor escritorLadrones;

    public EscribirDatosFachada(Escritor escritorLadrones){
        this.escritorLadrones = escritorLadrones;
    }

    public void actualizar(Policia unPolicia){
        this.escritorLadrones.escribir(unPolicia);
    }

}
