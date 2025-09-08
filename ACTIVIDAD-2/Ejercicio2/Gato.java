package Ejercicio2;

public class Gato extends Animal{
    private String raza;
    private boolean esDeInterior;


    public Gato(String nombre, String raza, int edad, double peso, char sexo, boolean esDeInterior) {
        super(nombre, "Gato", edad, peso, sexo, "Omnivoro");
        this.raza = raza;
        this.esDeInterior = esDeInterior;
    }

    public void setRaza(String raza){this.raza = raza;}
    public void setInterior(boolean interior){this.esDeInterior = esDeInterior;}

    public String getRaza(){return raza;}
    public boolean getInterior(){return esDeInterior;}

    @Override
    public void verInfo(){
        super.verInfo();
        System.out.print(
                "RAZA: " + raza
                + "\nDE INTERIOR: " + (esDeInterior ? "Si" : "No"));
    }
}
