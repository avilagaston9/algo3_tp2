package clases.ladron;

import clases.OrdenArresto;
import clases.Policia;
import clases.armas.Arma;
import clases.pistas.Pista;
import clases.pistas.PistaSinInformacion;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

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

    public Pista pedirPista(Novato unRango) { return this.calcularChances(0.8);  }

    public Pista pedirPista(Detective unRango) { return this.calcularChances(0.6);  }

    public Pista pedirPista(Investigador unRango) { return this.calcularChances(0.5); }

    public Pista pedirPista(Sargento unRango) { return this.calcularChances(0.5);  }

    public boolean tieneLaCaracteristica(CaracteristicaLadron unaCaracteristica) {
       for(int i=0;i<this.caracteristicas.size();i++)
           if (this.caracteristicas.get(i).equals(unaCaracteristica)) {
               return true;
           }
       return false;
    }

    public boolean verOrden(OrdenArresto ordenDeArresto) {
        return ordenDeArresto.comparar(this);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladron ladron = (Ladron) o;
        return iteradorCaracteristicas == ladron.iteradorCaracteristicas && Objects.equals(caracteristicas, ladron.caracteristicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iteradorCaracteristicas, caracteristicas);
    }
}


