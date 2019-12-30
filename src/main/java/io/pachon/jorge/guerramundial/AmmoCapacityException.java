package io.pachon.jorge.guerramundial;

class AmmoCapacityException extends Exception {
    public AmmoCapacityException(int capacidadMunicion){
        super("La municion se agotó" + capacidadMunicion);
    }
}
