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
            this.rango = new Novato(this.arrestos);
            return;
        }
        if(this.arrestos < 10){
            this.rango = new Detective(this.arrestos);
            return;
        }
        if(this.arrestos < 20){
            this.rango = new Investigador(this.arrestos);
            return;
        }
        this.rango = new Sargento(this.arrestos);
    }

    public Rango getRango(){
        return (this.rango);

    }
}
