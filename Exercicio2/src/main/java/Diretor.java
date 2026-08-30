public class Diretor extends Gerente {

	private double participacaoLucros;

	public Diretor(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, 
			int tamanhoEquipe, double percentualBonus, double participacaoLucros) {
		
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe,
				percentualBonus);
		this.participacaoLucros = participacaoLucros;
	}

	@Override
	public double calcularSalario() {
		// Pega o cálculo completo do Gerente e acrescenta a participação nos lucros
		return super.calcularSalario() + participacaoLucros;
	}
}