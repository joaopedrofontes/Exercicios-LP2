package sistemaDePagamento;

public class Boleto extends Pagamento implements Autenticacao {
    private String codigo;

    public Boleto (double valor, String codigo) {
        super(valor);
        this.codigo = codigo;
    }

    public boolean autenticar(double dinheiroNaConta) {
        return super.getValor() <= dinheiroNaConta;
    }

    public void realizarPagamento(double dinheiroNaConta) {
        if(autenticar(dinheiroNaConta)) {
            System.out.println("Pagamento realizado com sucesso!");
        }
        else {
            System.out.println("Erro ao realizar pagamento!");
        }
    }
}
