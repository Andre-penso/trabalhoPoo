package faculdade;



public class Mestrado extends Professor{
	private static final double plus = 3.55;
	
	public Mestrado(String nome, int cpf, double salario, double salfinal, String nivel)  {
		super(nome, cpf, salario, plus, salfinal);
	}
	
}
