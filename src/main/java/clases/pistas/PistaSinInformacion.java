package clases.pistas;

public class PistaSinInformacion implements Pista {

	@Override
	public String revelar() {
		return "Lo sentimos, no tenemos informacion del ladron";
	}

	@Override
	public boolean equals(Pista pista) {
		return false;
	}
}
