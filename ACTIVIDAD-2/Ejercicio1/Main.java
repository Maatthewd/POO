package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Mateo", "Silvano", 46813019, 20, 2023);
        Alumno alumno2 = new Alumno("Luca", "Peano", 46840529, 20, 2024);
        Alumno alumno3 = new Alumno("Nicolas", "Aiassa", 44216012, 21, 2022);


        System.out.println(alumno1.getLegajo());
        System.out.println(alumno2.getLegajo());
        System.out.println(alumno3.getLegajo());

        alumno1.setAñoIngreso(2022);
        alumno1.setDNI(46813020);

        alumno3.setLegajo(19199);

        System.out.println(alumno1.getAñoIngreso());
        System.out.println(alumno1.getDNI());

        System.out.println(alumno3.getLegajo());

    }


}
