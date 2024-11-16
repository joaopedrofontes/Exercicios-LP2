package sistemaDePagamento;


public abstract class Pagamento {
	private double valor;
	public Pagamento(double valor) {
		this.valor = valor;
	}
	public abstract void realizarPagamento(double donheiroNaConta);
	public double getValor() {
		return valor;
	}
}
