package Ejercicio1;

public class Docente {

    private String nombre, apellido, materia;
    private int edad;

    public Docente(String nombre, String apellido, String materia, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this. edad = edad;
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public void setMateria(String materia){this.materia = materia;}
    public void setEdad(int edad){this.edad = edad;}

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public String getMateria(){return materia;}
    public int getEdad(){return edad;}

    @Override
    public String toString(){
        return "\nDOCENTE: "
                + "\nNOMBRE: " + nombre
                + "\nAPELLIDO: " + apellido
                + "\nMATERIA: " + materia
                + "\nEDAD: " + edad;
    }



}
