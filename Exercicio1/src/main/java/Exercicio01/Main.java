package Exercicio01;

public class Main {
	public static void main(String[] args) {
		MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

		agenda.adicionarAniversariante("Arthur", 15, 4);
		agenda.adicionarAniversariante("Arthur", 15, 4);
		agenda.adicionarAniversariante("Lucas", 15, 4);

		System.out.println("Aniversariantes dia 15/04: " + agenda.obterAniversariantesDoDia(15, 4));

		agenda.removerAniversariante("Lucas");

		System.out.println("Após remoção: " + agenda.obterAniversariantesDoDia(15, 4));
	}
}
