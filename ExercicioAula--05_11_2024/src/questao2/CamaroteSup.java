package questao2;

public class CamaroteSup extends IngressoVip{
    private String localizacao;
    private float precoSup;
    public CamaroteSup(float preco, String localizacao) {
        super(preco);
        this.localizacao = localizacao;
        this.precoSup = super.getPrecoVip() * 1.3f;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public float getPrecoSup() {
        return precoSup;
    }
}