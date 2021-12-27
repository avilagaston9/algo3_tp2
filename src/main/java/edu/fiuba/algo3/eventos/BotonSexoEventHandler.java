package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import edu.fiuba.algo3.contenedores.ContenedorSexo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonSexoEventHandler implements EventHandler<ActionEvent> {
 Stage stage ;
 Scene muestraSexo;

 public BotonSexoEventHandler(AlgoThief algoThief){
  this.stage = new Stage(StageStyle.UNDECORATED);
  ContenedorSexo contenedorSexo = new ContenedorSexo(algoThief,stage);
  this.muestraSexo = new Scene(contenedorSexo,200,200);
  this.stage.initModality(Modality.APPLICATION_MODAL);
 }

 @Override
 public void handle(ActionEvent actionEvent) {
  this.stage.setScene(muestraSexo);
  this.stage.show();

 }
}
