package faculdade;



public class Doutorado extends Professor{
	private static final double plus = 5;
	
	public Doutorado(String nome, int cpf, double salario, double salfinal, String nivel) {
		super(nome, cpf, salario, plus, salfinal);
	}
}
