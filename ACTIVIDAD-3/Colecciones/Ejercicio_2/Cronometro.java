package Colecciones.Ejercicio_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Cronometro {

    private long inicio;
    private long fin;
    private long tiempo;

    public long getTiempo(){return tiempo;}

    public void start(){
        inicio = System.nanoTime()/1_000_000;
    };

    public void stop(){
        fin = System.nanoTime()/1_000_000;
        tiempo = fin - inicio;
    };

    public void reset(){
        inicio = 0;
        fin = 0;
    };

}

