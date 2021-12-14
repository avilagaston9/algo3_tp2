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

    Pista pedirPista(Novato unRango) {

        if (Math.random() < 0.8) {

            this.iteradorCaracteristicas++;
            return caracteristicas.get(iteradorCaracteristicas % 5).darPista();
        }
        return new PistaSinInformacion();
    }

    Pista pedirPista(Detective unRango) {

        if (Math.random() < 0.6) {

            this.iteradorCaracteristicas++;
            return caracteristicas.get(iteradorCaracteristicas % 5).darPista();
        }
        return new PistaSinInformacion();
    }

    Pista pedirPista(Investigador unRango) {

        if (Math.random() < 0.5) {

            this.iteradorCaracteristicas++;
            return caracteristicas.get(iteradorCaracteristicas % 5).darPista();
        }
        return new PistaSinInformacion();
    }

    Pista pedirPista(Sargento unRango) {

        if (Math.random() < 0.5) {

            this.iteradorCaracteristicas++;
            return caracteristicas.get(iteradorCaracteristicas % 5).darPista();
        }
        return new PistaSinInformacion();
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


