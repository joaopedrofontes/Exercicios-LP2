package questao1;

public class Velho extends Imovel{
    private double precoNovo;

    public Velho(String endereco, double preco) {
        super(endereco, preco);
        this.precoNovo = preco * 0.9;
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