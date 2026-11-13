package ec5Ultimate;

public class Aluno extends Pessoa{

    private double nota1;

    private double nota2;

//Constructor
    public Aluno(String nome, double cpf, double nota1, double nota2) {
        super(nome, cpf);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
//Getters/Seterrs
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    //Funcao/Def

    public double calcularMedia() {
        return (getNota1() + getNota2()) /2;
    }

    public String verificarSituacao() {

        if (calcularMedia() < 5) {
            return "Reprovado!";

        } else if (calcularMedia() < 7) {
            return "Recuperação!";

        } else {
            return "Aprovado!";
        }

    }
    public void exibirDadosResumidos(){
        System.out.println("Name: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Situaçao: " + verificarSituacao());

    }
}
