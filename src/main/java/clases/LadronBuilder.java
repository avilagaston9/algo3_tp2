package clases;

public class LadronBuilder{

    public FabricaDePistas(){
        this.cabello = null;
        this.hobby = null;
        this.sexo = null;
        this.senia = null;
        this.vehiculo = null;
    }

    public void setCabello(Cabello c){
        this.cabello = c;
    }

    public void setHobby(Hobby h){
        this.hobby = h;
    }

    public void setSexo(Sexo s){
        this.sexo = s;
    }

    public void setSenia(Senia s){
        this.senia = s;
    }

    public void setVehiculo(Vehiculo v){
        this.vehiculo = v;
    }

    public Ladron getLadron(){
        Ladron ladron = new Ladron(this.setCabello, this.hobby, this.sexo, this.senia, this.vehiculo);
        return ladron;

    }

}