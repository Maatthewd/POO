package Ejercicio2;

public class Perro extends Animal{
    private String raza;
    private boolean esDeServicio;


    public Perro(String nombre, String raza, int edad, double peso, char sexo, boolean esDeServicio) {
        super(nombre, "Perro", edad, peso, sexo, "Omnivoro");
        this.raza = raza;
        this.esDeServicio = esDeServicio;
    }

    public void setRaza(String raza){this.raza = raza;}
    public void setServicio(boolean servicio){this.esDeServicio = servicio;}

    public String getRaza(){return raza;}
    public boolean getServicio(){return esDeServicio;}

    @Override
    public void verInfo(){
        super.verInfo();
        System.out.print(
                "RAZA: " + raza
                + "\nSERVICIO: " + ( esDeServicio ? "Si" : "No" ) );
    }
}
