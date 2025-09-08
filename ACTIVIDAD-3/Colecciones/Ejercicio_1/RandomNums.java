package Colecciones.Ejercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class RandomNums {

    public static void main(String[] args){

        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            array.add(random.nextInt(100000));
        }

        //Guardar los valores maximos y minimos en las variables min, max
        int min = Collections.min(array);
        int max = Collections.max(array);

        //Guardar las posiciones de min, max
        int posMin = array.indexOf(min);
        int posMax = array.indexOf(max);


        System.out.println("Valor minimo del array: " + min + ". Posicion: " + posMin);
        System.out.println("Valor maximo del array: " + max + ". Posicion: " + posMax);
    }


}
