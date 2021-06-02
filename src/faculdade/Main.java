package faculdade;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void chamarMenu() {
		System.out.println("1 – CADASTRO PROFESSOR\r\n" + 
						   "2 – LISTAR TODOS OS CADASTROS\r\n" + 
						   "3 – EXCLUIR PROFESSOR\r\n" + 
						   "99 – SAIR DO PROGRAMA");
	}
	
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		int opcao;
		HashMap<String, Professor> professores = new HashMap<>();
		Professor professor = new Professor();

		do {
			chamarMenu();
			opcao = teclado.nextInt();

			switch (opcao) {
			
			case 1:
				professor.cadastrarProfessor(professores);
				break;
			case 2:
				professor.listarProfessor(professores);
				break;	
			case 3:
				professor.deletar(professores);
				break;	
			case 99:
				System.out.println("Você saiu do programa!");
				break;
			default:
				System.out.println("Opção inválida!");
					
			}
		} while (opcao != 99);
	}
	
	

}
