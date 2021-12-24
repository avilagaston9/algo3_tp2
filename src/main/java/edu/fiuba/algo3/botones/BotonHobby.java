package edu.fiuba.algo3.botones;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonHobby extends MenuButton {

    public BotonHobby(){
        this.setText("Hobby");
        MenuItem tenis = new MenuItem("Tenis");
        MenuItem musica = new MenuItem("Musica");
        MenuItem alpinismo = new MenuItem("Alpinismo");
        MenuItem paracaidismo = new MenuItem("Paracaidismo");
        MenuItem natacion = new MenuItem("Natacion");
        MenuItem croquet = new MenuItem("Croquet");

        this.getItems().addAll(tenis,musica,alpinismo,paracaidismo,natacion,croquet);

    }
}
