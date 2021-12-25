package clases.valorObjetoRobado;

import clases.rangos.*;

public class ObjetoMuyValioso extends ObjetoRobado{
    @Override
    public boolean esValidoPara(Novato rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Detective rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Investigador rango){
        return false;
    }

    @Override
    public boolean esValidoPara(Sargento rango){
        return true;
    }
}
