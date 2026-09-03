import java.util.Scanner;

public class Livro extends Produto implements InfoGerais{
	
	private String Autor;

	private String getAutor() {
		return Autor;
	}

	private void setAutor(String autor) {
		Autor = autor;
	}

	@Override
	public void exibirInfo() {
		System.out.println("\nInformações do livro");
		super.exibirInfo();
		System.out.println("Autor: " + getAutor());
	}
	
	
	
	
}


