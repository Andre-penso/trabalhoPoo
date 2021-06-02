package faculdade;

import java.util.HashMap;
import java.util.Scanner;

public class Professor {
	private String nome, nivel;
	private int cpf;
	private double salario, plus, salfinal;

	
	public Professor() {}
	
	public Professor(String nome, int cpf, double salario, double plus, double salfinal) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.plus = plus;
		this.salfinal = salfinal;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	public double getPlus() {
		return plus;
	}	
	public void setPlus(double plus) {
		this.plus = plus;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nome = nivel;
	}
	public double getSalfinal() {
		return salfinal;
	}	
	public void setSalfinal(double salfinal) {
		this.salfinal = salfinal;
	}
	
	
	
	public static boolean encontrouProfessor(HashMap<String, Professor> professores, String nome) {
		if(professores.containsKey(nome)) {
			return true;
		} else {
			return false;
		}
	}
	

	public void cadastrarProfessor(HashMap<String, Professor> professores) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do Professor: ");
		String nome = teclado.nextLine();
		
		System.out.println("Informe o CPF: ");
		int cpf = teclado.nextInt();
		
		System.out.println("Informe o Salario: ");
		Double salario = teclado.nextDouble();
		
		if (Professor.encontrouProfessor(professores, nome)) {
			System.out.println("Professor já cadastrado!");
		} else {
			System.out.println("Informe a sua graduação:\r\n" + "1 – Pos\r\n" + "2 – Mestrado\r\n" + "3 – Doutorado");
			int tipoProfessor = teclado.nextInt();
			switch (tipoProfessor) {
			case 1:
				professores.put(nome, new Pos(nome, cpf, salario, 0));
				System.out.println("Professor com Pos cadastrado!");
				professores.get(nome).nivel = "Pos";
				professores.get(nome).salfinal = professores.get(nome).salario * professores.get(nome).plus;
				break;
			case 2:
				professores.put(nome, new Mestrado(nome, cpf, salario, 0, "Mestrado"));
				System.out.println("Professor com Mestrado cadastrado!");
				professores.get(nome).nivel = "Mestrado";
				professores.get(nome).salfinal = professores.get(nome).salario * professores.get(nome).plus;
				break;
			case 3:
				professores.put(nome, new Doutorado(nome, cpf, salario, 0, "Doutorado"));
				System.out.println("Professor com Doutorado cadastrado!!");
				professores.get(nome).nivel = "Doutorado";
				professores.get(nome).salfinal = professores.get(nome).salario * professores.get(nome).plus;
				break;
			default:
				System.out.println("Opção inválida!");
			}

		}

	}
	public void listarProfessor(HashMap<String, Professor> professores) {
		
		for (String key: professores.keySet()){  
			System.out.println("CADASTRO:");
			System.out.println("____________________________________");
			System.out.println("Nome:" +professores.get(key).getNome());
			System.out.println("CPF:" +professores.get(key).getCpf());
			System.out.println("Nivel:" +professores.get(key).getNivel());
			System.out.println("Salario Base:" +professores.get(key).getSalario());
			System.out.println("Salario Bruto:" +professores.get(key).getSalfinal());
			System.out.println("____________________________________");
			;
			
		} 

	}
	public void deletar(HashMap<String, Professor> professores) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o Nome do Professor: ");
		String nome = teclado.nextLine();
		
		if (Professor.encontrouProfessor(professores, nome)) {
			Professor returned_value = professores.remove(nome);
			System.out.println("Cadastro deletado!");
					
		} else {
			System.out.println("Cadastro não encontrato!");
		}
		
	}


	
	
	
}
