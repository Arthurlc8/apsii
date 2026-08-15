package Exercicio01;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	void adicionarAniversariante(String nome, int dia, int mes);

	ArrayList<String> obterAniversariantesDoDia(int dia, int mes);

	void removerAniversariante(String nome);
}