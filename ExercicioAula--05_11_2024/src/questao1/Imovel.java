package questao1;

public abstract class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getEndereco() {
        return this.endereco;
    }
}