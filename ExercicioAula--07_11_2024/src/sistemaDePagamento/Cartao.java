package sistemaDePagamento;

public class Cartao extends Pagamento implements Autenticacao{
    private String senha;
    public Cartao(double valor, String ssenha) {
        super(valor);
        this.senha = ssenha;
    }

    public boolean autenticar(double limite) {
        return super.getValor() <= limite;
    }

    public void realizarPagamento(double limite) {
        if(autenticar(limite)) {
            System.out.println("Pagamento efetuado com sucesso com sucesso!");
        }
        else {
            System.out.println("Erro ao realizar pagamento!");
        }
    }
}
