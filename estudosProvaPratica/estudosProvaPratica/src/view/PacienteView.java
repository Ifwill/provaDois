package view;

import java.util.Scanner;

public class PacienteView {
	
	private Scanner scanner;
	
	
	public PacienteView() {
		scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("-----menu-----");
		System.out.println("1- adicior paciente");
		System.out.println("2- excluir paciente");
		System.out.println("");
		
		return scanner.nextInt();
	}
	
	public String nome() {
		System.out.println("nome:");
		return scanner.next();
	}
	
	public String cpf() {
		System.out.println("CPF:");
		return scanner.next();
	}
	
	public String excluirPorCpf() {
		System.out.println("CPF do Paciente que voce deseja excluir:");
		return scanner.next();
	}
	
	public void mensagemDeExcluimento() {
		System.out.println("Paciente removido com sucesso !!");
		System.out.println();
	}
	
	public int idade() {
		System.out.println("Idade:");
		return scanner.nextInt();
	}
	
	public boolean sexo() {
		boolean sexo = true;
		
		System.out.println("digite M ou F");
		String escolha = scanner.nextLine();
		scanner.nextLine();
		System.out.println("valor de escolha: " + escolha);
		if(escolha.equals("M") || escolha.equals("m")) {
			System.out.println("masculino: ");
			sexo = true;
			System.out.println("sexo: " + sexo);
		}else if(escolha.equals("F") || escolha.equals("f")) {
			System.out.println("feminino: ");
			sexo = false;
			System.out.println("sexo: " + sexo);
		}else {
			System.err.println("falhou");
		}
		
		return sexo;
		
	}

}
