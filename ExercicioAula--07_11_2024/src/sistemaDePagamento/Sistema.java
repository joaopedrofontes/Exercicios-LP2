package sistemaDePagamento;
import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		listarOpcoes();
		System.out.print("Opcao escolhida: ");
		int escolha = scanner.nextInt();
		
	}
	
	public static void listarOpcoes() {
		System.out.println("Escolha uma das seguintes formas de pagamento: ");
		System.out.println("(1) Cartão de crédito");
		System.out.println("(2) Boleto bancário");
		System.out.println("(3) Pix");
	}
}
