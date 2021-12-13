package clases;

public class Sargento extends Rango {

    public Sargento(){

        this.arrestos = 20;
        this.maximoArrestos = 0;
    }
    @Override
    public Rango siguienteRango() { return this;   }
}
