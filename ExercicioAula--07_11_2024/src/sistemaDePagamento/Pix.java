package sistemaDePagamento;

public class Pix extends Pagamento implements Autenticacao {
    String chavePix;
    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    public boolean autenticar(double dinheroNaConta) {
        return super.getValor() <= dinheroNaConta;
    }

    public void realizarPagamento(double dinheroNaConta) {
        if(autenticar(dinheroNaConta)){
            System.out.println("Pagamento realizado com sucesso!");
        }
        else {
            System.out.println("Erro ao realizar pagamento!");
        }
    }
}
