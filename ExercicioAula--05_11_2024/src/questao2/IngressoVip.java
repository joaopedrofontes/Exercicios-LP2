package questao2;

public abstract class IngressoVip extends Ingresso {
    private float precoVip;

    public IngressoVip(float preco) {
        super(preco);
        this.precoVip = preco * 1.3f;
    }

    public float getPreco() {
        return super.getPreco();
    }

    public float getPrecoVip() {
        return precoVip;
    }
}