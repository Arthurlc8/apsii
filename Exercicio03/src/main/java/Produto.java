
public class Produto implements InfoGerais{

	public String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public double Preco;

	
	@Override
	public void exibirInfo() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: R$ " + getPreco());
	}
	
}
