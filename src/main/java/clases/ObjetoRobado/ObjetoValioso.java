package clases.ObjetoRobado;

import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

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
