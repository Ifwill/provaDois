package model;

public class Paciente {
	private String cpf;
	private String nome;
	private int idade;
	private boolean sexo;
	
	
	//construtores
	public Paciente() {
	}
	
	public Paciente(String cpf,String nome,int idade,boolean sexo) {
		this.cpf=cpf;
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
	}

	//gets e sets
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean isSexo() {
		return sexo;
	}
	
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	
	
}
