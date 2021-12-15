package clases;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private ArrayList<Ladron> ladrones;
    private ArrayList<CaracteristicaLadron> caracteristicas;

    public Computadora(ArrayList<Ladron> unosLadrones) {
        this.ladrones=unosLadrones;
        this.caracteristicas = new ArrayList<CaracteristicaLadron>();
    }

//    public ArrayList<Ladron> cargarDatosYBuscar(List<CaracteristicaLadron> caracteristicas, Tiempo tiempo) {
//        ArrayList<Ladron> sospechosos= (ArrayList<Ladron>) this.ladrones.clone();
//        for (int i=0;i<caracteristicas.size();i++) {
//            ArrayList<Ladron>posiblesSospechosos= new ArrayList<>();
//            for (int j = 0; j < sospechosos.size(); j++) {
//                if (sospechosos.get(j).tieneLaCaracteristica(caracteristicas.get(i))) {
//                    posiblesSospechosos.add(sospechosos.get(j));
//                }
//            }
//            sospechosos = (ArrayList<Ladron>) posiblesSospechosos.clone();
//        }
//        tiempo.sumarHoras(3);
//        return sospechosos;
//    }

    public void cargarCaracteristica(CaracteristicaLadron caracteristica){
        caracteristicas.add(caracteristica);
    }

    public ArrayList<Ladron> buscarSospechosos(Tiempo tiempo){
        ArrayList<Ladron> sospechosos = new ArrayList<Ladron>();

        for (Ladron unLadron: this.ladrones){
            boolean cumple = true;
            for (CaracteristicaLadron unaCaracterisica: this.caracteristicas){
                if (!unLadron.tieneLaCaracteristica(unaCaracterisica)){
                    cumple = false;
                    break;
                }
            }
            if (cumple){
                sospechosos.add(unLadron);
            }
        }
        tiempo.sumarHoras(3);
        return sospechosos;
    }
}
