package io.pachon.jorge.guerramundial;

public class Motocicleta extends Vehiculo implements WeaponableMode {
    public Motocicleta(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception{
        super(capacidadPersonas, capacidadToneladas, capacidadMunicion);
    }

    public void doWeapon() {

    }
}
