package edu.fiuba.algo3.modelo.OrdenDeArresto;

import edu.fiuba.algo3.modelo.ladron.Ladron;

public interface OrdenArresto {
	boolean comparar(Ladron ladron);
	String nombreLadronEnLaOrden();

}
