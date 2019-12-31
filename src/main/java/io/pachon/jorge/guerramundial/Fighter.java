package io.pachon.jorge.guerramundial;

public class Fighter extends Vehiculo implements ShootableMode, Flyable {
    public Fighter(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception {
        super(capacidadPersonas, capacidadToneladas, capacidadMunicion);
    }

    public void doFly() {

    }

    public void doShoot() {

    }
}
