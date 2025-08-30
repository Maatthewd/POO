package Ejercicio1;

public class Asignatura {

    private String nombre, codigo, horario, periodo;
    private int cargaHoraria;

    public Asignatura(String nombre, String codigo, String periodo, String horario, int cargaHoraria){
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodo = periodo;
        this.horario = horario;
        this.cargaHoraria = cargaHoraria;
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setCodigo(String codigo){this.codigo = codigo;}
    public void setHorario(String horario){this.horario = horario;}
    public void setCargaHoraria(int cargaHoraria){this.cargaHoraria = cargaHoraria;}

    public String getNombre(){return nombre;}
    public String getCodigo(){return codigo;}
    public String getHorario(){return horario;}
    public int getCargaHoraria(){return cargaHoraria;}

    @Override
    public String toString() {

        return "\nASIGNATURA: "
                + "\nNOMBRE: " + nombre
                + "\nCODIGO: " + codigo
                + "\nPERIODO: " + periodo
                + "\nHORARIO: " + horario
                + "\nCARGA HORARIA: " + cargaHoraria;
    }
}
