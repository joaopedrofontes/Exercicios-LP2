package Ex5;
import java.util.ArrayList;
public class CadastroPessoas {
    private ArrayList<Pessoa> pessoas;

    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void imprimeCadastro() {
        for(int i = 0; i < pessoas.size(); i++) {
            pessoas.get(i).mostrarDados();
        }
    }
}