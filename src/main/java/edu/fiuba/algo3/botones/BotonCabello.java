package edu.fiuba.algo3.botones;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonCabello extends MenuButton {

    public BotonCabello(){
        this.setText("Cabello");
        MenuItem castanio = new MenuItem("Castaño");
        MenuItem rubio = new MenuItem("Rubio");
        MenuItem Rojo = new MenuItem("Rojo");
        MenuItem Negro = new MenuItem("Negro");

        this.getItems().addAll(castanio,rubio,Rojo,Negro);
    }
}
