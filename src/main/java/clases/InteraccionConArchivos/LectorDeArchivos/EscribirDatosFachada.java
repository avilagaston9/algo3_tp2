package clases.InteraccionConArchivos.LectorDeArchivos;

import clases.Policia;

public class EscribirDatosFachada {

    private Escritor escritorLadrones;

    public EscribirDatosFachada(Escritor escritorLadrones){
        this.escritorLadrones = escritorLadrones;
    }

    public void actualizar(Policia unPolicia){
        this.escritorLadrones.escribir(unPolicia);
    }

}
