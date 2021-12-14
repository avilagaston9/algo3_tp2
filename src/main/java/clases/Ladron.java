package clases;

import java.util.LinkedList;
import java.util.Objects;

public class Ladron {
    private int iteradorCaracteristicas;
    private LinkedList<CaracteristicaLadron> caracteristicas;
    //private FabricaDePistas fabrica;
    //private Pista pista;

    public Ladron(CaracteristicaLadron cabello, CaracteristicaLadron hobby, CaracteristicaLadron sexo, CaracteristicaLadron senia, CaracteristicaLadron vehiculo) {

        this.iteradorCaracteristicas = 0;
        this.caracteristicas = new LinkedList<CaracteristicaLadron>();
        this.caracteristicas.add(cabello);
        this.caracteristicas.add(hobby);
        this.caracteristicas.add(sexo);
        this.caracteristicas.add(senia);
        this.caracteristicas.add(vehiculo);
    }

    private Pista calcularChances(double chances){
        if (Math.random() < chances) {

            this.iteradorCaracteristicas++;
            return caracteristicas.get(iteradorCaracteristicas % 5).darPista();
        }
        return new PistaSinInformacion();
    }

    public Pista pedirPista(Novato unRango) {

        return this.calcularChances(0.8);
    }

    public Pista pedirPista(Detective unRango) {

        return this.calcularChances(0.6);
    }

    public Pista pedirPista(Investigador unRango) {

        return this.calcularChances(0.5);
    }

    public Pista pedirPista(Sargento unRango) {

        return this.calcularChances(0.5);
    }

    public boolean conCaracteristica(CaracteristicaLadron unaCaracteristica) {
        for (int i = 0; i < caracteristicas.size(); i++) {
            if (unaCaracteristica.equals(caracteristicas.get(i))) {
                return true;
            }
        }
        return false;
    }
}


