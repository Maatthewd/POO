package Interfaces.Ejercicio_3;

public class TalkAdmin {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();
        RelojCuCu reloj = new RelojCuCu();

        hacerHablar(perro);
        hacerHablar(gato);
        hacerHablar(reloj);
    }


    public static void hacerHablar(Hablador e){
        e.hablar();
    }
}
