package io.pachon.jorge.guerramundial;

public class Vehiculo {

    private int capacidadPersonas;
    private int capacidadToneladas;
    private int CapacidadMunicion;

    public Vehiculo(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion) throws Exception {

        if (capacidadMunicion == 0) throw new Exception("Ya no se cuenta con municiones disponibles para atacar ...");
        this.capacidadPersonas = capacidadPersonas;
        this.capacidadToneladas = capacidadToneladas;
        CapacidadMunicion = capacidadMunicion;
    }

    public Vehiculo(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }


    public boolean atacar(){

        return true;
    }

    public int adicionarTropas(int capacidadPersonas, int capacidadToneladas, int capacidadMunicion){


        return 0;

    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
}
