package edu.fiuba.algo3.interfaz.vistas;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.Observador;
import edu.fiuba.algo3.interfaz.contenedores.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VistaPrincipal implements Observador {

	private final Stage stage;
	private final AlgoThief algoThief;
	private boolean darBienvenida;
	private boolean darInformacionInicial;

	public VistaPrincipal(Stage stage, AlgoThief algothief) {

		this.darBienvenida = true;
		this.darInformacionInicial = true;
		this.stage = stage;
		this.algoThief = algothief;
	}

	@Override
	public void actualizar() {

		if(this.darBienvenida){

			this.mostrarEscenaBienvenida();
		}else if (this.darInformacionInicial){

			this.mostrarEscenaConInfoInicial();
		}else if(!this.algoThief.juegoEnCurso()){// el juego acaba de terminar

			this.mostrarResultadosPartida();
		}
	}

	private void mostrarResultadosPartida() {
		Scene nuevaScene;
		if(this.algoThief.juegoGanado()){

			nuevaScene = new Scene(new ContenedorJuegoGanado(this.algoThief, this.stage),
					640, 480);
		} else if(this.algoThief.tiempoInsuficiente()){

			nuevaScene = new Scene(new ContenedorTiempoInsuficiente(this.algoThief,
					this.stage), 640, 480);
		}else{ nuevaScene = new Scene(new
				ContenedorSinOrdenDeArresto(this.algoThief, this.stage), 640, 480); }
		this.stage.setScene(nuevaScene);
		stage.show();
		this.darInformacionInicial = true;
	}

	private void mostrarEscenaConInfoInicial() {
		this.darInformacionInicial = false;
		ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(this.stage, this.algoThief);
		Scene escenaPrincipal = new Scene(contenedorPrincipal, 640, 480);

		ContenedorInformacionInicial contenedorInfomacionInicial = new ContenedorInformacionInicial(this.stage,
				this.algoThief, escenaPrincipal);
		Scene proximaEscena = new Scene(contenedorInfomacionInicial, 640, 480);
		this.stage.setScene(proximaEscena);
		this.stage.show();
	}

	private void mostrarEscenaBienvenida() {
		this.darBienvenida = false;
		ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(this.stage, this.algoThief);
		Scene proximaEscena = new Scene(contenedorBienvenidos, 640, 480);
		this.stage.setScene(proximaEscena);
		stage.show();
	}
}






