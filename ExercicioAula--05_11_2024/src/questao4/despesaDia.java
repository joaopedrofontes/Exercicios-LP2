package questao4;


public class despesaDia extends despesaMes {
    private int dia;

    public despesaDia(int dia, int mes, float valor) {
        super(mes, valor);
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }
}