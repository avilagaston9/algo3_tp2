package edu.fiuba.algo3.modelo.ObjetoRobado;

import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public class ObjetoComun extends ObjetoRobado {

	public ObjetoComun(String nombre, String ciudad) {
		super(nombre,ciudad);
		this.largoRutaDeEscape = 4;
	}

	@Override
	public boolean esValidoPara(Novato rango) {
		return true;
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
		return false;
	}

}
