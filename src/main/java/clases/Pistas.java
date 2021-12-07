package clases;

import java.util.List;

public class Pistas {
    private Pista pistaFacil;
    private Pista pistaMedia;
    private Pista pistaDificil;

    public Pistas(){
    }

    public Pista pistaFacil() {
        return  pistaFacil;
    }

    public void agregarPistaFacil(Pista pistaLugar) {
        pistaFacil=pistaLugar;
    }

    public Pista PistaMedia() {
        return  pistaMedia;
    }

    public void agregarPistaMedia(Pista pistaLugar) {
        pistaFacil=pistaLugar;
    }

    public Pista pistaDificil() {
        return  pistaFacil;
    }

    public void agregarPistadificil(Pista pistaLugar) {
        pistaFacil=pistaLugar;
    }
}



