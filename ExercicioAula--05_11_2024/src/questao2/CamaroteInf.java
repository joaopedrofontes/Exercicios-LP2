package questao2;

public class CamaroteInf extends IngressoVip{
    private String localizacao;

    public CamaroteInf(float preco, String localizacao) {
        super(preco);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public float getPreco() {
        return super.getPrecoVip();
    }
}