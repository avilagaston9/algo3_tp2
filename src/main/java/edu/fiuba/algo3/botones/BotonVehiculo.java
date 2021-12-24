package edu.fiuba.algo3.botones;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonVehiculo extends MenuButton {

    public BotonVehiculo(){
        this.setText("Vehiculo");
        MenuItem descapotable = new MenuItem("Descapotable");
        MenuItem limusina = new MenuItem("Limusina");
        MenuItem deportivo = new MenuItem("Deportivo");
        MenuItem moto = new MenuItem("Moto");

        this.getItems().addAll(descapotable,limusina,deportivo,moto);

    }
}
