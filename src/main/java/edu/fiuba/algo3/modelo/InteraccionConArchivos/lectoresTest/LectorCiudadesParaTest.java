package edu.fiuba.algo3.modelo.InteraccionConArchivos.lectoresTest;

import edu.fiuba.algo3.modelo.InteraccionConArchivos.Lector;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;

import java.util.ArrayList;

public class LectorCiudadesParaTest implements Lector {

    private final ArrayList<Ciudad> ciudades;

    public LectorCiudadesParaTest(ArrayList<Ciudad> ciudades){
        this.ciudades = ciudades;
    }
    @Override
    public ArrayList leer() {
        return this.ciudades;
    }
}
