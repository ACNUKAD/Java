package model;
// classe base que tem alguns atributos e 1 unico m�todo
//classe pai

public class Pessoa {
	
	protected String nome;
	protected String email;
	protected String telefone;
	
	public void mostrarInfo() {
		System.out.println("Nome: "+nome+" Email: "+email+" Telefone: "+telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	
}
