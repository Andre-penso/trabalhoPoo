package faculdade;

public class Pos extends Professor{
	private static final double plus = 2;
	
	public Pos(String nome, int cpf, double salario, double salfinal) {
		super(nome, cpf, salario, plus, salfinal);
	}
}
