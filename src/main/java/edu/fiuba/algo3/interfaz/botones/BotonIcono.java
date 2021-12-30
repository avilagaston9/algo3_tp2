package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.eventos.BotonBuscarPistaEventHandler;
import edu.fiuba.algo3.interfaz.Resources;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonIcono extends Button {

    public BotonIcono(String pathIcono, EventHandler<ActionEvent> handler){

        try{
            FileInputStream input = new FileInputStream(pathIcono);
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            this.setGraphic(imageView);
            this.setMaxSize(150, 150);
            this.setOnAction(handler);
        }catch (FileNotFoundException e){
            System.out.println(pathIcono + " no entontrado.");
        }
    }
}
