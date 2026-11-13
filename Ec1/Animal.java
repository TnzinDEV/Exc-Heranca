package Ec1;

public class Animal {
    //constructor
    protected String nome;

    public String getNome() {
        return this.nome;
    }
//getters
    public String emitirsom() {
        return "...";
    }

    public String apresentar() {
        return this.nome + " faz " + emitirsom();
    }
}
