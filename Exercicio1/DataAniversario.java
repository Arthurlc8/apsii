package Exercicio01;

public class DataAniversario {

	private int dia;
	private int mes;

	public DataAniversario(int dia, int mes) {

		this.dia = dia;
		this.mes = mes;

	}

	public boolean equals(Object outraData) {
		if (outraData instanceof DataAniversario) {
			DataAniversario outraDataAniversario = (DataAniversario) outraData;
			return (outraDataAniversario.dia == this.dia && outraDataAniversario.mes == this.mes);
		}
		return false;
	}

	public String toString() {

		return this.dia + "/" + this.mes;

	}
}
