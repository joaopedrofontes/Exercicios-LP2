
abstract class Conta {
    protected double saldo;
    protected double juros;
    private int tipo;

    public Conta(double saldo, int tipo ) {
        this.saldo = saldo;
        this.juros = 0.01;
        this.tipo = tipo;
    }


    public abstract void calcularJuros();

    public void exibirSaldo() {
        if(tipo == 1) {
            System.out.println("Saldo conta corrente: R$ " + saldo);
        }
        else if(tipo == 2) {
            System.out.println("Saldo conta poupança: R$ " + saldo);
        }
    }
}

class ContaCorrente extends Conta  {

    public ContaCorrente(double saldo) {
        super(saldo, 1);
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * juros;
        System.out.println("Juros aplicados na Conta Corrente.");
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo, 2);
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * juros;
        System.out.println("Juros aplicados na Conta Poupança.");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(1000.0);
        Conta contaPoupanca = new ContaPoupanca(1000.0);

        contaCorrente.exibirSaldo();
        contaCorrente.calcularJuros();
        contaCorrente.exibirSaldo();

        contaPoupanca.exibirSaldo();
        contaPoupanca.calcularJuros();
        contaPoupanca.exibirSaldo();
    }
}
