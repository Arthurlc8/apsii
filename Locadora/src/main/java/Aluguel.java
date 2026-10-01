public class Aluguel {
	
	private int diasAlugada;
	private Fita fita;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}

	//A classe agora calcula o seu próprio valor
	
	public double calcularValor() {
		double valorCorrente = 0;
		switch (fita.getCodigoDePreco()) {
		
		case Fita.NORMAL:
			valorCorrente += 2;
			if (diasAlugada > 2)
				valorCorrente += (diasAlugada - 2) * 1.5;
			break;
		case Fita.LANCAMENTO:
			valorCorrente += diasAlugada * 3;
			break;
		case Fita.INFANTIL:
			valorCorrente += 1.5;
			if (diasAlugada > 3)
				valorCorrente += (diasAlugada - 3) * 1.5;
			break;
		}
		return valorCorrente;
	}

	//A classe agora calcula os seus próprios pontos
	
	public int calcularPontosFrequentes() {
		int pontos = 1;
		if ((fita.getCodigoDePreco() == Fita.LANCAMENTO) && diasAlugada > 1) {
			pontos++;
		}
		return pontos;
	}
}