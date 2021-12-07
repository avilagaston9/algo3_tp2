package clases;

import java.util.List;

public class Novato implements Rango {
    private List <Pista> pistasDevueltas;

    public Novato(){
    }

    @Override
    public List<Pista> pedirPista(Pistas pistasBanco, Ladron ladron) {
        pistasDevueltas.add(0,pistasBanco.pistaFacil());
        pistasDevueltas.add(1,ladron.darPista());
        return pistasDevueltas;
    }
}
