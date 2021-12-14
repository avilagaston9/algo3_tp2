package clases.edificios;

import clases.Tiempo;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;
import clases.pistas.*;

public abstract class Edificio {

    protected Pista pistaFacil;
    protected Pista pistaMedia;
    protected Pista pistaDificil;

    public Edificio(){

        Pista pistaDefault = new PistaSinInformacion();
        this.pistaFacil = pistaDefault;
        this.pistaMedia = pistaDefault;
        this.pistaDificil = pistaDefault;
    }

    public void setPista(PistaFacil pistaFacil){ this.pistaFacil = pistaFacil; }
    public void setPista(PistaMedia pistaMedia){ this.pistaMedia = pistaMedia; }
    public void setPista(PistaDificil pistaDificil){ this.pistaDificil = pistaDificil; }

    public abstract Pista serVisitado(Novato rango, Tiempo tiempo);
    public abstract Pista serVisitado(Detective rango, Tiempo tiempo);
    public abstract Pista serVisitado(Investigador rango, Tiempo tiempo);
    public abstract Pista serVisitado(Sargento rango, Tiempo tiempo);

    //public boolean sosIgual(Edificio edificio);
}
