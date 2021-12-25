package clases.valorObjetoRobado;

import clases.rangos.*;

public class ObjetoComun extends ObjetoRobado{
    @Override
    public boolean esValidoPara(Novato rango){
        return true;
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
        return false;
    }
}
