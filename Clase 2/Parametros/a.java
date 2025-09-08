package Parametros;

public class a {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        modif(a, b);

        System.out.println(a);
        System.out.println(b);

        Bici bici = new Bici(2);
        System.out.println(bici.getRodaje());
        modif(bici);
        System.out.println(bici.getRodaje());
    }


    public static void modif(int a, int b){
        a = 30;
        b = 50;
        System.out.println(a+b);
    }

    public static void modif(Bici bici){
        bici.setRodaje(30);
        System.out.println(bici.getRodaje());
    }


    public static class Bici {
        private int rodaje;

        public Bici(int rodaje){this.rodaje = rodaje;}

        public void setRodaje(int rodaje){this.rodaje = rodaje;}
        public int getRodaje(){return rodaje;}
    }

}
