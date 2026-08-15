package Exercicio01;

public class DataAniversario {
	private int dia;
	private int mes;

	public DataAniversario(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		DataAniversario other = (DataAniversario) obj;
		return dia == other.dia && mes == other.mes;
	}
}