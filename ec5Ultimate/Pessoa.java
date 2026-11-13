package ec5Ultimate;

public class Pessoa {

    private String nome;

    private double cpf;
//Constructor
    public Pessoa(String nome, double cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
//Getter/Setter//
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    //Funcao/Def


    public void exibirDadosResumidos(){
        System.out.println("Name: " + getNome());
        System.out.println("CPF: " + getCpf());
    }
}
