package io.pachon.jorge.guerramundial;

public class Camion extends Vehiculo implements ShootableMode, WeaponableMode{
    public Camion(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception {
        super(capacidadPersonas, capacidadToneladas, capacidadMunicion);
    }

    public void doShoot() {

    }

    public void doWeapon() {

    }
}
