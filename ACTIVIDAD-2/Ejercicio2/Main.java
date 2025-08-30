package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Perro Milan = new Perro("Milan", "Border Collie", 2, 20.5, 'M', false);
        Milan.verInfo();

        Perro Baloo = new Perro("Baloo", "Ovejero Belga", 3, 42, 'M', false);
        Baloo.verInfo();

        Gato Simba = new Gato("Simba", "Siames", 5, 10.5, 'F', true);
        Simba.verInfo();

        Caballo Relampago = new Caballo("Relampago", "Pura Sangre", 6, 420, 'M', true);
        Relampago.verInfo();

        Relampago.setEdad(7);
        Relampago.verInfo();

        Caballo Spirit = new Caballo("Spirit", "Kiger", 5, 500, 'M', false);
        Spirit.verInfo();

        Spirit.setPeso(420);
        Spirit.verInfo();
    }
}
