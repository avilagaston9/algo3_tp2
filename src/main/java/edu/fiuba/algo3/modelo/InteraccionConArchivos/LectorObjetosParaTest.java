package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;

import java.util.ArrayList;

public class LectorObjetosParaTest implements Lector {


    private final ArrayList<ObjetoRobado> objetosRobados;

    public LectorObjetosParaTest(ArrayList<ObjetoRobado> objetosRobados){
        this.objetosRobados= objetosRobados;
    }

    @Override
    public ArrayList leer() {
        return this.objetosRobados;
    }
}
