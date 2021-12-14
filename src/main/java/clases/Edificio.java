package clases;

import java.util.List;

public abstract class Edificio {

    protected Pista pistaFacil;
    private Pista pistaMedia;
    private Pista pistaDificil;

    public Edificio(){

        Pista pistaDefault = new PistaSinInformacion();
        this.pistaFacil = pistaDefault;
        this.pistaMedia = pistaDefault;
        this.pistaDificil = pistaDefault;
    }

    public void setPistaFacil(Pista pistaFacil){ this.pistaFacil = pistaFacil; }
    public void setPistaMedia(Pista pistaMedia){ this.pistaMedia = pistaMedia; }
    public void setPistaDificil(Pista pistaDificil){ this.pistaDificil = pistaDificil; }

    abstract Pista serVisitado(Novato rango);
    abstract Pista serVisitado(Detective rango);
    abstract Pista serVisitado(Investigador rango);
    abstract Pista serVisitado(Sargento rango);

    //public boolean sosIgual(Edificio edificio);
}
