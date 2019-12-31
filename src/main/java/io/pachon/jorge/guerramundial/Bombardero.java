package io.pachon.jorge.guerramundial;

public class Bombardero extends Vehiculo implements ShootableMode, ReleasableAtDiscretion, WeaponableMode  {
    public Bombardero(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception {
        super(capacidadPersonas, capacidadToneladas, capacidadMunicion);
    }

    public void doRelease() {

    }

    public void doShoot() {

    }

    public void doWeapon() {

    }
}
