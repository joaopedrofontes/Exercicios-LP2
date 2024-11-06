package questao2;

public abstract class Ingresso {
    private float preco;

    Ingresso(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void imprimeValor() {
        System.out.println(preco);
    }
}