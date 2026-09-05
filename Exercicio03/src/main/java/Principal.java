import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Livro livro = new Livro();
		
		System.out.print("Digite o nome do livro: "); 
		livro.setNome(scanner.nextLine());

		System.out.print("Digite o preço do livro: R$ "); 
		livro.setPreco(scanner.nextDouble());
		scanner.nextLine();

		System.out.print("Digite o nome do autor do livro: ");
		livro.setAutor(scanner.nextLine());
		
		
		CD cd = new CD();
		System.out.print("\nDigite o nome do CD: ");
		cd.setNome(scanner.nextLine());

		System.out.print("Digite o valor do CD: R$ ");
		cd.setPreco(scanner.nextDouble());
		scanner.nextLine();

		System.out.print("Digite o número de faixas que contém o CD: ");
		cd.setNumFaixas(scanner.nextInt());

		System.out.println("\n------------------------");
		cd.exibirInformacoes();
		System.out.println("\n------------------------");
		livro.exibirInformacoes();

		scanner.close();

	}

}
