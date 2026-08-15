package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}

	public Aniversariante(String nome, DataAniversario data) {
		this.nome = nome;
		this.dataAniversario = data;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Aniversariante other = (Aniversariante) obj;
		return nome.equals(other.nome) && dataAniversario.equals(other.dataAniversario);
	}

	public String getNome() {
		return nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}
}