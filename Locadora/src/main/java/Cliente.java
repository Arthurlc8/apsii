import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> alugueis = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		alugueis.add(aluguel);
	}

	public String extrato() {
		double valorTotal = 0;
		int pontosDeAlugadorFrequente = 0;
		String resultado = "Registro de Alugueis de " + getNome() + "\n";

		for (Aluguel aluguel : alugueis) {
			//Delegação correta: o Cliente pede ao Aluguel para se resolver
			double valorCorrente = aluguel.calcularValor();
			pontosDeAlugadorFrequente += aluguel.calcularPontosFrequentes();

			resultado += "\t" + aluguel.getFita().getTitulo() + "\t" + valorCorrente + "\n";
			valorTotal += valorCorrente;
		}

		
		resultado += "Valor total devido: " + valorTotal + "\n";
		resultado += "Você ganhou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
		return resultado;
	}
}