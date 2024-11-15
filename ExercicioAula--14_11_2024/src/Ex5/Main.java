package Ex5;
public class Main {
    public static void main(String[] args) {
        CadastroPessoas cadastroPessoas = new CadastroPessoas();

        cadastroPessoas.cadastraPessoa(new Cliente("João Pedro", new Data(8, 6, 2005)));
        cadastroPessoas.cadastraPessoa(new Funcionario("Felipe", new Data(13, 5, 2005), 2000));
        cadastroPessoas.cadastraPessoa(new Gerente("Luca", new Data(07, 07, 2005), "RH", 3000));

        cadastroPessoas.imprimeCadastro();
    }
}