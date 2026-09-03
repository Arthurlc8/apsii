
public class CD extends Produto implements InfoGerais{
	
	public int numFaixas;

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	
	@Override
	public void exibirInfo() {
		System.out.println("Informações do CD");
		super.exibirInfo();
		System.out.println("Número de faixas: " + numFaixas);
	}
	
	
}
