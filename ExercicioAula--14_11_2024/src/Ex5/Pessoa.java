package Ex5;

public abstract class Pessoa {
    private String nome;
    private Data dataDeNascimento;

    public Pessoa(String nome, Data dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    public abstract void mostrarDados();

    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento.getDataDeNascimento();
    }

}