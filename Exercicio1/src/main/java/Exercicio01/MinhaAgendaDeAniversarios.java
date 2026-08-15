package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	private ArrayList<Aniversariante> lista = new ArrayList<>();

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		lista.add(new Aniversariante(nome, dia, mes));
	}

	@Override
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
		ArrayList<String> resultado = new ArrayList<>();
		DataAniversario busca = new DataAniversario(dia, mes);
		for (Aniversariante a : lista) {
			if (a.getDataAniversario().equals(busca)) {
				resultado.add(a.getNome());
			}
		}
		return resultado;
	}

	@Override
	public void removerAniversariante(String nome) {
		lista.removeIf(a -> a.getNome().equals(nome));
	}
}