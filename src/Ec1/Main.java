package Ec1;

public class Main {
    public static void main(String[] args) {
        Animal Jeferson = new Vaca("Jeferson");
        System.out.println(Jeferson.apresentar());

        Animal Loki = new Cachorro("Loki");
        System.out.println(Loki.apresentar());

        Animal Melia = new gato("Melia");
        System.out.println(Melia.apresentar());

    }
}