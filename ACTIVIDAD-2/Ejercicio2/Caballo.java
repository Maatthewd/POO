package Ejercicio2;

public class Caballo extends Animal {
    private String raza;
    private boolean esDeCompetencia;

    public Caballo(String nombre, String raza, int edad, double peso, char sexo, boolean esDeCompetencia) {
        super(nombre, "Caballo", edad, peso, sexo, "Hervivoro");
        this.raza = raza;
        this.esDeCompetencia = esDeCompetencia;
    }

    public void setRaza(String raza){this.raza = raza;}
    public void setCompetencia(boolean competencia){this.esDeCompetencia = competencia;}

    public String getRaza(){return raza;}
    public boolean getCompetencia(){return esDeCompetencia;}

    @Override
    public void verInfo(){
        super.verInfo();
        System.out.print("RAZA: " + raza
                + "\nDE COMPETENCIA: " + ( esDeCompetencia ? "Si" : "No" ) );
    }
}
