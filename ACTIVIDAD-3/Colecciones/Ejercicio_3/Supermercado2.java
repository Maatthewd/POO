package Colecciones.Ejercicio_3;


import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class Supermercado2 {
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

        Scanner sc = new Scanner(System.in);
        boolean opcion = true;


        while (true) {

            if (opcion == false) break;


            int subtotal = 0;

            System.out.println("Ingresar cantidad a comprar por producto: ");
            try {
                for (String clave : productos.keySet()) {
                    if (subtotal != 0) System.out.println("SUBTOTAL: $" + subtotal);

                    System.out.print(clave + " ($" + productos.get(clave) + ")" + ": ");
                    usuario.put(clave, sc.nextInt());

                    subtotal += usuario.get(clave) * productos.get(clave);


                }
            }catch(InputMismatchException e){
                System.out.println("Opcion invalida");
                sc.nextLine();
                continue;
            }

            for (String clave : usuario.keySet()) {
                subtotal = usuario.get(clave) * productos.get(clave);
                total += subtotal;
            }

            System.out.println("\nTOTAL: $" + total);
            sc.nextLine();

            String respuesta;
            do {
                System.out.print("\n¿Continuar comprando? (S/N): ");
                respuesta = sc.nextLine().toLowerCase();
            } while (!respuesta.equals("s") && !respuesta.equals("n"));

            if (respuesta.equals("n")) {
                opcion = false;
            }

        };

    }



}
