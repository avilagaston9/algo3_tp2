package clases.rangos;


public class RangoBuilder {

    private int arrestos;
    private Rango rango;

    public void setArrestos(int arrestos){
        this.arrestos = arrestos;
        this.setRango();
    }

    private void setRango(){
        if(this.arrestos < 5 ){
            this.rango = new Novato();
            return;
        }
        if(this.arrestos < 10){
            this.rango = new Detective();
            return;
        }
        if(this.arrestos < 20){
            this.rango = new Investigador();
            return;
        }
        this.rango = new Sargento();
    }

    public Rango getRango(){
        return (this.rango);

    }
}
