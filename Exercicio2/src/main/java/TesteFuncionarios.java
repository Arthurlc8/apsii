public class TesteFuncionarios {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500.00, "01/03/2020");

		FuncionarioCLT f2 = new FuncionarioCLT("Bruno Reis", "C001", 3000.00, "10/06/2021", 220.00, 400.00);

		Gerente f3 = new Gerente("Carla Mendes", "G001", 8000.00, "15/01/2018", 300.00, 500.00, 12, 0.20);

		Estagiario f4 = new Estagiario("Diego Alves", "E001", 0.00, "05/08/2024", 1500.00, 20);

		Diretor f5 = new Diretor("Roberto Silva", "D001", 15000.00, "10/01/2015", 500.00, 800.00, 50, 0.30, 20000.00);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
	}
}