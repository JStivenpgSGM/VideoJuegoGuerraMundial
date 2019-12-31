package io.pachon.jorge.guerramundial;

public class Jeep extends Vehiculo implements ShootableMode, WeaponableMode{
    public Jeep(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception{
        super(capacidadPersonas, capacidadToneladas, capacidadMunicion);
    }

    public void doShoot() {

    }

    public void doWeapon() {

    }
}
