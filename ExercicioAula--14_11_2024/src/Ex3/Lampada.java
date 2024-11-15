package Ex3;

public class Lampada {
    private boolean EstadoInicial;

    public Lampada(boolean EstadoInicial) {
        this.EstadoInicial = EstadoInicial;
    }
    public boolean getEstadoInicial() {
        return EstadoInicial;
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada(true);
        System.out.println(lampada.getEstadoInicial());
    }
}