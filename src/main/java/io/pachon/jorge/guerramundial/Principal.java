package io.pachon.jorge.guerramundial;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Vehiculo vehiculo = new Vehiculo(50,100,100);

        Jeep jeep = new Jeep(6,5,10);
        Tanque tanque = new Tanque(4,40,100);
        Motocicleta motocicleta = new Motocicleta(2,0,1);
        Camion camion = new Camion(18,40,5);
        Bombardero bombardero = new Bombardero(4,5,30);
        Fighter fighter = new Fighter(2,1,10);
        Crucero crucero = new Crucero(200,1000,5);
        PortaAvion portaAvion = new PortaAvion(100,1000,200);

        System.out.println("**********************************************************************************");
        System.out.println("*                        MI JUEGO - SEGUNDA GUERRA MUNDIAL                       *");
        System.out.println("**********************************************************************************");
        System.out.println();

        System.out.println("- Estos son los vehiculos que están disponibles al público: ");


        System.out.println(" [0]: Jeep de reconocimiento.");
        System.out.println(" [1]: Tanque Sherman M4.");
        System.out.println(" [2]: Motocicleta Harley.");
        System.out.println(" [3]: Camión de transporte de suministro HI.");
        System.out.println(" [4]: Bombardero B56.");
        System.out.println(" [5]: Speed Fighter.");
        System.out.println(" [6]: Crucero tipo Alabama.");
        System.out.println(" [7]: porta aviones tipo Bismarck.");
        System.out.println(" ");

        System.out.println("¿Qué cantidad de tropas quiere adicionar al ataque: ");
        Scanner sC1 = new Scanner(System.in);
        int cantTropas = sC1.nextInt();

        System.out.println("¿Qué tropas quiere adicionar al ataque: ");

        System.out.println(" [0]: Jeep de reconocimiento.");
        System.out.println(" [1]: Tanque Sherman M4.");
        System.out.println(" [2]: Motocicleta Harley.");
        System.out.println(" [3]: Camión de transporte de suministro HI.");
        System.out.println(" [4]: Bombardero B56.");
        System.out.println(" [5]: Speed Fighter.");
        System.out.println(" [6]: Crucero tipo Alabama.");
        System.out.println(" [7]: porta aviones tipo Bismarck.");
        System.out.println(" ");

        int capacidadTropas = 0;
        int capacidadToneladas = 0;
        ArrayList<Integer> Tropas = new ArrayList<Integer>();
        for (int i = 0; i < cantTropas ; i++) {
            System.out.println("Seleccione - restantes: "+ (cantTropas-i));

            Scanner sC = new Scanner(System.in);
            int selectTropas = sC.nextInt();


            switch (selectTropas) {

                case 0:

                    System.out.println("Se añade: Jeep de reconocimiento.");
                    Tropas.add(jeep.adicionarTropas(6,5,10));
                    capacidadTropas += jeep.getCapacidadPersonas();

                    break;
                case 1:
                    System.out.println("Se añade: Tanque Sherman M4.");
                    Tropas.add(tanque.adicionarTropas(4,40,50));
                    capacidadTropas += tanque.getCapacidadPersonas();
                    capacidadToneladas += tanque.getCapacidadToneladas();
                    break;
                case 2:
                    System.out.println("Se añade: Motocicleta Harley.");
                    Tropas.add(motocicleta.adicionarTropas(2,0,1));
                    capacidadTropas += motocicleta.getCapacidadPersonas();
                    capacidadToneladas += motocicleta.getCapacidadToneladas();
                    break;
                case 3:
                    System.out.println("Se añade: Camión de transporte de suministro HI.");
                    Tropas.add(camion.adicionarTropas(18,40,5));
                    capacidadTropas += camion.getCapacidadPersonas();
                    capacidadToneladas += camion.getCapacidadToneladas();
                    break;
                case 4:
                    System.out.println("Se añade: Bombardero B56.");
                    Tropas.add(bombardero.adicionarTropas(4,5,30));
                    capacidadTropas += bombardero.getCapacidadPersonas();
                    capacidadToneladas += bombardero.getCapacidadToneladas();
                    break;
                case 5:
                    System.out.println("Se añade: Speed Fighter.");
                    Tropas.add(fighter.adicionarTropas(2,1,10));
                    capacidadTropas += fighter.getCapacidadPersonas();
                    capacidadToneladas += fighter.getCapacidadToneladas();
                    break;
                case 6:
                    System.out.println("Se añade: Crucero tipo Alabama.");
                    Tropas.add(crucero.adicionarTropas(200,1000,5));
                    capacidadTropas += crucero.getCapacidadPersonas();
                    capacidadToneladas += crucero.getCapacidadToneladas();
                    break;
                case 7:
                    System.out.println("Se añade: porta aviones tipo Bismarck.");
                    Tropas.add(portaAvion.adicionarTropas(100,1000,200));
                    capacidadTropas += portaAvion.getCapacidadPersonas();
                    capacidadToneladas += portaAvion.getCapacidadToneladas();
                    break;
            }
        }

        System.out.println("La capacidad de Personas que se pueden transportar en el ataque de tropa es de: " + capacidadTropas);

        System.out.println("La capacidad de toneladas que se pueden transportar en el ataque de tropa es de: " + capacidadToneladas);

        System.out.println(" ");

        ArrayList<Vehiculo> allCars = new ArrayList<Vehiculo>();

        allCars.add(jeep);
        allCars.add(tanque);
        allCars.add(motocicleta);
        allCars.add(camion);
        allCars.add(bombardero);
        allCars.add(fighter);
        allCars.add(crucero);
        allCars.add(portaAvion);

        for (Vehiculo  vehiculo1 :allCars
        ) {
            System.out.println(vehiculo1);
        }

        ArrayList<ShootableMode> shootableModes = new ArrayList<ShootableMode>();

        shootableModes.add(jeep);
        shootableModes.add(tanque);
        shootableModes.add(fighter);
        shootableModes.add(bombardero);
        shootableModes.add(camion);

        for (ShootableMode shootableMode1 :shootableModes
        ) {
            System.out.println(shootableMode1);
        }

        ArrayList<ReleasableAtDiscretion> releasableAtDiscretions = new ArrayList<ReleasableAtDiscretion>();

        releasableAtDiscretions.add(tanque);
        releasableAtDiscretions.add(bombardero);
        releasableAtDiscretions.add(portaAvion);

        for (ReleasableAtDiscretion releasableAtDiscretions1  :releasableAtDiscretions
        ) {
            System.out.println(releasableAtDiscretions1);
        }

        ArrayList<WeaponableMode> weaponableModes = new ArrayList<WeaponableMode>();

        weaponableModes.add(jeep);
        weaponableModes.add(tanque);
        weaponableModes.add(motocicleta);
        weaponableModes.add(camion);
        weaponableModes.add(bombardero);

        for (WeaponableMode weaponableMode  :weaponableModes
        ) {
            System.out.println(weaponableMode);
        }

        ArrayList<Flyable> flyables = new ArrayList<Flyable>();
        flyables.add(fighter);

        for (Flyable flyable  :flyables
        ) {
            System.out.println(flyable);
        }


    }




}
