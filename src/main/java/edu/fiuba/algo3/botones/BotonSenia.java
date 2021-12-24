package edu.fiuba.algo3.botones;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonSenia extends MenuButton {

    public BotonSenia(){
        this.setText("seña");
        MenuItem anillo = new MenuItem("Anillo");
        MenuItem tatuaje = new MenuItem("Tatuaje");
        MenuItem cicatriz = new MenuItem("Ciacatriz");
        MenuItem joyas = new MenuItem("Joyas");

        this.getItems().addAll(anillo,tatuaje,cicatriz,joyas);
    }
}
