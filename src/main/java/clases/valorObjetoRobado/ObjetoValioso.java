package clases.valorObjetoRobado;

import clases.rangos.*;

public class ObjetoValioso extends ObjetoRobado{
    @Override
    public boolean esValidoPara(Novato rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Detective rango){
        return true;
    }

    @Override
    public boolean esValidoPara(Investigador rango){
        return true;
    }

    @Override
    public boolean esValidoPara(Sargento rango){
        return false;
    }
}
