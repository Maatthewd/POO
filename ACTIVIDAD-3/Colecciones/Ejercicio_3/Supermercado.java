package Colecciones.Ejercicio_3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Supermercado {
    private static Map<String, Integer> productos = Map.of(
            "Leche", 1000,
           "Aceite", 2000,
            "Fideos", 500,
           "Arroz", 1200,
            "Cerveza", 2300
    );
    private static Map<String, Integer> usuario = new HashMap<>();
    private static float total = 0;

    public static void main(String[] args) {
        int subtotal;

        usuario.put("Aceite", 2);
        usuario.put("Fideos", 2);
        usuario.put("Arroz", 1);
        usuario.put("Cerveza", 1);
        usuario.put("Leche", 0);

        System.out.println("Compro: ");

        for(String clave : usuario.keySet()){
            subtotal = usuario.get(clave) * productos.get(clave);
            System.out.println(clave + ": " + usuario.get(clave) + " ($"+subtotal+")");
            total += subtotal;
        }

        System.out.println("TOTAL: $" + total);
    }



}
