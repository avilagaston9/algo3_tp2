package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

<<<<<<< HEAD
public interface CaracteristicaLadron { //todo esto tiene que ser una clase concreta, que reciba en su constructor la caracteristica (texto)...
    public Pista darPista();

    boolean equals(CaracteristicaLadron caracteristica);

    //todo chequear que la poista que se obtiene pertenzca a la coleccion de pistas correcta.
=======
import java.util.Objects;

public class  CaracteristicaLadron {
    private Pista pista;

    public CaracteristicaLadron(String caracteristica){
        this.pista= new PistaConInformacion(caracteristica);
    }

    public Pista darPista(){
        return pista;
    }

    public boolean equals(CaracteristicaLadron caracteristica){
        return this.pista.equals(caracteristica.darPista());
    }
>>>>>>> 1c01afaf937e6466a7a552621b647e19fb380576
}
