package questao1;

public class Novo extends Imovel {
    private double precoNovo;

    public Novo(String endereco, double preco) {
        super(endereco, preco);
        this.precoNovo = preco * 1.1;
    }

    public double getPreco() {
        return super.getPreco();
    }

    public double getPrecoNovo() {
        return precoNovo;
    }

    public double getDiferencaPreco() {
        return precoNovo - super.getPreco();
    }

    public String getEndereco() {
        return super.getEndereco();
    }
}