package view;

import java.util.Scanner;

public class PacienteView {
	
	private Scanner scanner;
	
	
	public PacienteView() {
		scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("-----menu-----");
		System.out.println("1- abre conexao");
		System.out.println("2- teste de conexao");
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
	
	public int idade() {
		System.out.println("Idade:");
		return scanner.nextInt();
	}
	
	public boolean sexo() {
		
		
		System.out.println("Digite 'M' para masculino ou 'F' para feminino: ");
		boolean input = scanner.nextLine();
		scanner.nextLine();
		if(input == "m") {
			return true;
			//System.out.println("opa!!");
		}else if(input.equals("F")) {
			return false;
			//System.out.println("opa 2!!");
		}else {
			System.out.println("entrada invalida");
		}
		
		return false;
		
	}

}
