package clases;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private ArrayList<Ladron> ladrones;

    public Computadora(ArrayList<Ladron> unosLadrones) {
        this.ladrones=unosLadrones;
    }

    public ArrayList<Ladron> cargarDatosYBuscar(List<CaracteristicaLadron> caracteristicas) {
        ArrayList<Ladron> sospechosos= (ArrayList<Ladron>) this.ladrones.clone();
        for (int i=0;i<caracteristicas.size();i++) {
            ArrayList<Ladron>posiblesSospechosos= new ArrayList<>();
            for (int j = 0; j < sospechosos.size(); j++) {
                if (sospechosos.get(j).conCaracteristica(caracteristicas.get(i))) {
                    posiblesSospechosos.add(sospechosos.get(j));
                }
            }
            sospechosos = (ArrayList<Ladron>) posiblesSospechosos.clone();
        }
        return sospechosos;
    }
}