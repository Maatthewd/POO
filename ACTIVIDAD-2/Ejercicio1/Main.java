package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Alumno Daiana = new Alumno(40259863, "Daiana", "Denisse", 547854, 28, 2023);
        System.out.println(Daiana.toString());

        Daiana.setLegajo(605879);
        System.out.println(Daiana.toString());

        Asignatura POO = new Asignatura("POO", "POO101","CUATRIMESTRAL","17:00 - 20:00", 48);
        System.out.println(POO.toString());

        Docente Matias = new Docente("Matias", "Aiassa", "POO", 25);
        System.out.println(Matias.toString());
    }


}
