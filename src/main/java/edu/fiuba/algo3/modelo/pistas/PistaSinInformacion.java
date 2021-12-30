package edu.fiuba.algo3.modelo.pistas;

public class PistaSinInformacion implements Pista {

	@Override
	public String revelar() {
		return "No tenemos informacion sobre su apariencia.";
	}

	@Override
	public boolean equals(Pista pista) {
		return false;
	}
}
