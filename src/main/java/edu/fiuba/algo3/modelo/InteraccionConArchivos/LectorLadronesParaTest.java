package edu.fiuba.algo3.modelo.InteraccionConArchivos;

import edu.fiuba.algo3.modelo.ladron.Ladron;

import java.util.ArrayList;

public class LectorLadronesParaTest implements Lector{

    private final ArrayList<Ladron> policias;

    public LectorLadronesParaTest(ArrayList<Ladron> ladrones){
        this.policias = ladrones;
    }
    @Override
    public ArrayList leer() {
        return this.policias;
    }
}
