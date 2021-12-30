package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.Policia.Policia;

public class RegistrarDatosFachada {

    private Escritor escritorLadrones;

    public RegistrarDatosFachada(Escritor escritorLadrones){
        this.escritorLadrones = escritorLadrones;
    }

    public void actualizar(Policia unPolicia){
        this.escritorLadrones.escribir(unPolicia);
    }

}
