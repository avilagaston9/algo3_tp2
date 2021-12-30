package edu.fiuba.algo3.modelo.ObjetoRobado;

import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public class ObjetoMuyValioso extends ObjetoRobado {

	public ObjetoMuyValioso(String nombre, String ciudad) {
		super(nombre, ciudad);
		this.largoRutaDeEscape = 7;
	}

	@Override
	public boolean esValidoPara(Novato rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Detective rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Investigador rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Sargento rango) {
		return true;
	}

}
