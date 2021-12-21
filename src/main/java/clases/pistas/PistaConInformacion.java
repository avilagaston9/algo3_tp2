package clases.pistas;

public class PistaConInformacion implements Pista {

	private String pista;

	public PistaConInformacion(String caracteristica) {
		this.pista = caracteristica;
	}

	@Override
	public String revelar() {
		return this.pista;
	}

	@Override
	public boolean equals(Pista unaPista) {
		return this.revelar().equals(unaPista.revelar());
	}
}
