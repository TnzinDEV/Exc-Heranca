package Ec1;

public class Cachorro extends Animal{
    //constructor
    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public String emitirsom() {
        return "Au!";
    }
}
