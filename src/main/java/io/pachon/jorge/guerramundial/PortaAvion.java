package io.pachon.jorge.guerramundial;

public class PortaAvion extends Vehiculo implements ReleasableAtDiscretion{
    public PortaAvion(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception{
        super(capacidadPersonas, capacidadToneladas, capacidadMunicion);
    }

    public void doRelease() {

    }
}
