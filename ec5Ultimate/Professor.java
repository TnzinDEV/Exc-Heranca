package ec5Ultimate;

public class Professor extends Pessoa{
    private double quantidadeAulas;

    private double valorHoraAula;
//Getter/Setter
    public double getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(double quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
//Constructor
    public Professor(String nome, double cpf, double quantidadeAulas, double valorHoraAula) {
        super(nome, cpf);
        this.quantidadeAulas = quantidadeAulas;
        this.valorHoraAula = valorHoraAula;
    }
//Funcao/Def
    public double calcularPagamento(){
           return  (getQuantidadeAulas() * getValorHoraAula());
        }

    public void exibirDadosResumidos(){
        System.out.println("Name: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Pagamento: " +calcularPagamento());

    }
    }

