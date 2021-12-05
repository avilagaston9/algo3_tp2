package clases;

import java.util.Collection;

public class Ciudad {
    private Edificio edificios;

    public Ciudad(){
        edificios=null;
    }

    public void asignarEdificio(Edificio banco) {
        edificios=banco;
    }

    public void visitarEdificio(Edificio banco, Detective detective) {
        banco.serVisitado(detective);




    }
}
