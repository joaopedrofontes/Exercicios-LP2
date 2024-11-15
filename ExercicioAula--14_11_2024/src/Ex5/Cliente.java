package Ex5;

public class Cliente extends Pessoa {

    public Cliente(String nome, Data dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Cliente:");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de nascimento: " + super.getDataDeNascimento());
    }
}