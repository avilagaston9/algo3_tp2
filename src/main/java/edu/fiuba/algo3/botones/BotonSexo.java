package edu.fiuba.algo3.botones;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonSexo extends MenuButton {

    public BotonSexo(){
        this.setText("sexo");
        MenuItem masculino = new MenuItem("Masculino");
        MenuItem femenino  = new MenuItem("Femenino");

        this.getItems().addAll(masculino, femenino);
    }
}
