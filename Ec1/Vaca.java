package Ec1;

public class Vaca extends Animal{
    //constructor
    public Vaca(String nome) {
        this.nome = nome;
    }

    @Override
    public String emitirsom() {
        return "Muu!";
    }

}
