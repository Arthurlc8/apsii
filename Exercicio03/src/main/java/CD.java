
public class CD extends Produto implements InfoGerais{
	
	public int numFaixas;

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	
	@Override
	public void exibirInformacoes() {
		System.out.println("\nInformações do CD\n");
		super.exibirInformacoes();
		System.out.println("Número de faixas: " + getNumFaixas());
	}
	
	
}
