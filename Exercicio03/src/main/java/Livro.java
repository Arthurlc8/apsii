import java.util.Scanner;

public class Livro extends Produto implements InfoGerais {

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("\nInformações do livro\n");
		super.exibirInformacoes();
		System.out.println("Autor: " + getAutor());
	}

}
