
public class Produto implements InfoGerais {

	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.printf("Preço: R$ %.2f\n", getPreco());
	}

}
