package Ejercicio1;

public class Alumno {

    private int legajo, DNI, añoIngreso, edad;
    private String nombre, apellido;


    public Alumno(int DNI, String nombre, String apellido, int legajo, int edad, int añoIngreso){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.añoIngreso = añoIngreso;
    }


    public void setLegajo(int legajo){this.legajo = legajo;}
    public void setDNI(int DNI){this.DNI = DNI;}
    public void setAñoIngreso(int añoIngreso){this.añoIngreso = añoIngreso;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}

    public int getLegajo(){return legajo;}
    public int getDNI(){return DNI;}
    public int getAñoIngreso(){return añoIngreso;}

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}

    @Override
    public String toString() {
        return "\nALUMNO: "
                + "\nDNI: " + DNI
                + "\nNOMBRE: " + nombre
                + "\nAPELLIDO: " + apellido
                + "\nLEGAJO: " + legajo
                + "\nEDAD : " + edad
                + "\nAÑO DE INGRESO: " + añoIngreso;
    }
}