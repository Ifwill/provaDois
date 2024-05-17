package model;

public class Medico {
	private int crm;
	private String email;
	private String nome; 
	private int idade;
	private boolean sexo;
	
	
	//contrutores
	public Medico() {
	}
	
	public Medico(int crm,String email,String nome,int idade,boolean sexo) {
		this.crm = crm;
		this.email=email;
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
	}
	//gets e sets

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
