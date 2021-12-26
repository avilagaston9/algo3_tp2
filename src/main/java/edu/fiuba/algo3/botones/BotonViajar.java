package edu.fiuba.algo3.botones;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class BotonViajar extends MenuButton {

    public BotonViajar(ImageView imageView){
        this.setGraphic(imageView);
        MenuItem primerCiudad = new MenuItem("Bs.As");
        MenuItem segundaCiudad= new MenuItem("Paris");
        MenuItem tercerCiudad=  new MenuItem("Londres");
        this.getItems().addAll(primerCiudad,segundaCiudad,tercerCiudad);
        this.setMaxSize(150,150);
    }
}
