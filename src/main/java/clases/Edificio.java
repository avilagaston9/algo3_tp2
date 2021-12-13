package clases;

import java.util.List;

public class Edificio {

    private Pista pistaFacil;
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

    public Pista serVisitado(Novato rango){ return this.pistaFacil}
    public Pista serVisitado(Detective rango){ return this.pistaMedia}
    public Pista serVisitado(Investigador rango){ return this.pistaDificil}
    public Pista serVisitado(Sargento rango){ return this.pistaDificil}

    //public boolean sosIgual(Edificio edificio);
}
