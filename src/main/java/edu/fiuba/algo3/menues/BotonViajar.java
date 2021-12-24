package edu.fiuba.algo3.menues;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonViajar extends MenuButton {

    public BotonViajar(){
        this.setText("Viajar");
        MenuItem primerCiudad = new MenuItem("Bs.As");
        MenuItem segundaCiudad= new MenuItem("Paris");
        MenuItem tercerCiudad=  new MenuItem("Londres");
        this.getItems().addAll(primerCiudad,segundaCiudad,tercerCiudad);
    }
}
