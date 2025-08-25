package Ejercicio1;

import java.util.Random;

public class Alumno {

    private int legajo, DNI, añoIngreso, edad;
    private String nombre, apellido;
    private Random random = new Random();


    public Alumno(String nombre, String apellido, int DNI, int edad, int añoIngreso){
        this.DNI = DNI;
        this.añoIngreso = añoIngreso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        generarLegajo();
    }


    public void setLegajo(int nuevoLegajo){legajo = nuevoLegajo;}
    public void setDNI(int nuevoDNI){DNI = nuevoDNI;}
    public void setAñoIngreso(int nuevoAñoIngreso){añoIngreso = nuevoAñoIngreso;}
    public void setNombre(String nuevoNombre){nombre = nuevoNombre;}
    public void setApellido(String nuevoApellido){apellido = nuevoApellido;}

    public int getLegajo(){return legajo;}
    public int getDNI(){return DNI;}
    public int getAñoIngreso(){return añoIngreso;}

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}

    private void generarLegajo(){
        setLegajo(random.nextInt(10000,20000));
    }





}