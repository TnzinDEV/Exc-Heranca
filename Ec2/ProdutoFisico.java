package Ec2;

public class ProdutoFisico extends Produto {

    private static final double FRETE_BASE = 10.00;
    private static final double VALOR_POR_KG = 5.00;

    private double pesoKg;

    public ProdutoFisico(String nome, double preco, double pesoKg) {
        super(nome, preco);
        this.pesoKg = pesoKg;
    }


    //getter
    public double getPesoKg() {
        return pesoKg;
    }

    //setter
    public void setPesoKg(double pesoKg) {
        if (pesoKg >= 0) {
            this.pesoKg = pesoKg;
        } else {
            System.out.println("Peso inválido! O peso não pode ser negativo.");
        }
    }


    @Override
    public double calcularFrete() {
        return FRETE_BASE + (VALOR_POR_KG * pesoKg);
    }
}