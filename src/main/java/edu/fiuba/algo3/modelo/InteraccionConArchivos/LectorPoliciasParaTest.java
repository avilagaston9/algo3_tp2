package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.Policia;

import java.util.ArrayList;

public class LectorPoliciasParaTest implements Lector{

    private final ArrayList<Policia> policias;

    public LectorPoliciasParaTest(ArrayList<Policia> policias){
        this.policias = policias;
    }
    @Override
    public ArrayList leer() {
        return this.policias;
    }
}
