
public class FuncionarioCLT extends Funcionario{
	
	public int Va;
	public int Vr;
	
	public FuncionarioCLT (String nome, String matricula, double salarioBase, String dataAdmissao, int Va, int Vr) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.Va = Va;
		this.Vr = Vr;
	}
	

}
