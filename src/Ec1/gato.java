package Ec1;

public class gato extends Animal{
    //constructor
    public gato(String nome) {
        this.nome = nome;
    }

    @Override
    public String emitirsom() {
        return "Miau!";
    }
}
