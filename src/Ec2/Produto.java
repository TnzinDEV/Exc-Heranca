package Ec2;

public class Produto {
    private final double FRETE_FIXO = 10.00;
    private String nome;

    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


//setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //funçao/Def

    public double calcularFrete() {
        if (preco >= 100.00) {
            return 0.0;
        }
        return FRETE_FIXO;
    }


    public double calcularPrecoFinal() {
        return getPreco() + calcularFrete();


    }
}
