package edu.fiuba.algo3.botones;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BorrarCaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonBorrarCaracteristicaVehiculo extends MenuButton {
    public BotonBorrarCaracteristicaVehiculo(AlgoThief algothief) {
        this.setText("Borrar");
        MenuItem descapotable = new MenuItem("Descapotable");
        MenuItem deportivo = new MenuItem("Deportivo");
        MenuItem limusina = new MenuItem("Limusina");
        MenuItem moto = new MenuItem("Moto");



        BorrarCaracteristicaEventHandler descapotableHandler = new BorrarCaracteristicaEventHandler("Descapotable",algothief);
        BorrarCaracteristicaEventHandler deportivoHandler = new BorrarCaracteristicaEventHandler("Deportivo",algothief);
        BorrarCaracteristicaEventHandler limusinaHandler = new BorrarCaracteristicaEventHandler("Limusina",algothief);
        BorrarCaracteristicaEventHandler motoHandler = new BorrarCaracteristicaEventHandler("Moto",algothief);


        descapotable.setOnAction(descapotableHandler);
        deportivo.setOnAction(deportivoHandler);
        limusina.setOnAction(limusinaHandler);
        moto.setOnAction(motoHandler);




        this.getItems().addAll(descapotable,deportivo,limusina,moto);
    }
}
