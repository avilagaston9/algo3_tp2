package clases.ladron;

import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;

public class LadronBuilder{

    private CaracteristicaLadron cabello;
    private CaracteristicaLadron hobby;
    private CaracteristicaLadron sexo;
    private CaracteristicaLadron senia;
    private CaracteristicaLadron vehiculo;

    public void setCabello(CaracteristicaLadron cabello){
        this.cabello = cabello;
    }

    public void setHobby(CaracteristicaLadron hobby){
        this.hobby = hobby;
    }

    public void setSexo(CaracteristicaLadron sexo){ this.sexo = sexo;  }

    public void setSenia(CaracteristicaLadron senia){
        this.senia = senia;
    }

    public void setVehiculo(CaracteristicaLadron vehiculo){
        this.vehiculo = vehiculo;
    }

    public Ladron getLadron(){
        return  new Ladron(this.cabello, this.hobby, this.sexo, this.senia, this.vehiculo);
    }

}