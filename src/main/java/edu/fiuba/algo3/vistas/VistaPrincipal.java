package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.Observador;
import edu.fiuba.algo3.contenedores.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import clases.InteraccionConArchivos.LectorDeArchivos.ObtenerDatosFachada;

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
		algothief.setObservador(this);
	}

/*
	public VistaPrincipal(Stage stage) throws FileNotFoundException {

		this.stage = stage;

		ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaPrincipal, algothief);
		Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);

		stage.setScene(escenaBienvenidos);
		stage.setFullScreen(true);

		stage.show();




		this.algothief = algothief;
		algothief.setObservador(this);

		ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, algothief, ciudades, ladrones);
		Scene escenaPrincipal = new Scene(contenedorPrincipal, 640, 480);

	}

 */
	@Override
	public void actualizar() {

		if(this.darBienvenida){

			this.darBienvenida = false;
			ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(this.stage, this.algoThief);
			Scene proximaEscena = new Scene(contenedorBienvenidos, 640, 480);
			this.stage.setScene(proximaEscena);
			stage.show();
		}else if (this.darInformacionInicial){

			this.darInformacionInicial = false;
			ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(this.stage, this.algoThief);
			Scene escenaPrincipal = new Scene(contenedorPrincipal, 640, 480);

			ContenedorInformacionInicial contenedorInfomacionInicial = new ContenedorInformacionInicial(this.stage,
			this.algoThief, escenaPrincipal);
			Scene proximaEscena = new Scene(contenedorInfomacionInicial, 640, 480);
			this.stage.setScene(proximaEscena);
			this.stage.show();
		}else if(!this.algoThief.juegoEnCurso()){// el juego acaba de terminar

			//aca se crea la escena jugar denuevo.
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
	}
}






