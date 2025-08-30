package Ejercicio2;

public class Animal {

    private String nombre, especie, alimentacion;
    private char sexo;
    private int edad;
    private double peso;



    public Animal(String nombre, String especie, int edad, double peso, char sexo, String alimentacion){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.alimentacion = alimentacion;
    }


    public void setNombre(String nombre){this.nombre = nombre;}
    public void setEspecie(String especie){this.especie = especie;}
    public void setEdad(int edad){this.edad = edad;}
    public void setPeso(double peso){this.peso = peso;}
    public void setSexo(char sexo){this.sexo = sexo;}
    public void setAlimentacion(String alimentacion){this.alimentacion = alimentacion;}

    public String getNombre(){return nombre;}
    public String  getEspecie(){return especie;}
    public int getEdad(){return edad;}
    public double getPeso(){return peso;}
    public char getSexo(){return sexo;}
    public String getAlimentacion(){return alimentacion;}




    public void verInfo(){

        System.out.println( "\n\nNOMBRE: " + nombre
                + "\nESPECIE: " + especie
                + "\nEDAD: " + edad + " años"
                + "\nPESO: " + peso + "kg"
                + "\nSEXO: " + sexo
                + "\nALIMENTACION: " + alimentacion);
    }
}
