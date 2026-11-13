package Ec2;

public class ProdutoDigital extends Produto{
    private double tamanhoArquivoMb;

    public ProdutoDigital(String nome, double preco, double tamanhoArquivoMb) {
        super(nome, preco);
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }

    //getter
    public double getTamanhoArquivoMb() {
        return tamanhoArquivoMb;
    }

    //setter
    public void setTamanhoArquivoMb(double tamanhoArquivoMb) {
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }

    public double calcularFrete(){
        return 0.0;
    }
}
