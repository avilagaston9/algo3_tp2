package clases;

public class Investigador extends Rango {

    public Investigador(){

        this.arrestos = 10;
        this.maximoArrestos = 20;
    }

    @Override
    public Rango siguienteRango() {  return new Sargento();   }
}
