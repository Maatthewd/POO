package Colecciones.Ejercicio_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Cronometro crono = new Cronometro();
        ArrayList<Integer> array = new ArrayList<>();

        crearArray(array, 100);
        sortTime(array, crono);

        crearArray(array, 10_000);
        sortTime(array, crono);

        crearArray(array, 100_000);
        sortTime(array, crono);

        crearArray(array, 1_000_000);
        sortTime(array, crono);

    }

    private static void crearArray(ArrayList array, int size){
        Random random = new Random();
        System.out.println("Creando array de: " + size + " elementos.");
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(10000));
        }
    }

    private static void sortTime(ArrayList array, Cronometro crono){
        crono.start();
        System.out.println("ORDENANDO ARRAY...  ");
        Collections.sort(array);
        crono.stop();
        System.out.println("Tiempo: " + crono.getTiempo() + "ms");
        crono.reset();
    }
}
