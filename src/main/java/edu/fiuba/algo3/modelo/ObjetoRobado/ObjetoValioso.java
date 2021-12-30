package edu.fiuba.algo3.modelo.ObjetoRobado;

import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public class ObjetoValioso extends ObjetoRobado {

	public ObjetoValioso(String nombre, String ciudad) {
		super(nombre, ciudad);
		this.largoRutaDeEscape = 5;
	}

    @Override
	public boolean esValidoPara(Novato rango) {
		return false;
	}

	@Override
	public boolean esValidoPara(Detective rango) {
		return true;
	}

	@Override
	public boolean esValidoPara(Investigador rango) {
		return true;
	}

	@Override
	public boolean esValidoPara(Sargento rango) {
		return false;
	}

}
