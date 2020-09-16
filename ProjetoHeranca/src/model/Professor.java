package model;
//outra classe filha

public class Professor extends Pessoa {

	private String disciplina;
	private String anoFormacao;
	
	public void mostrarInfo() {
		System.out.println("Professor: "+nome+ " Email: "+email+ "telefone: "+telefone + "Disciplina: "+disciplina+ "Ano formação: "+anoFormacao);
		
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getAnoFormacao() {
		return anoFormacao;
	}

	public void setAnoFormacao(String anoFormacao) {
		this.anoFormacao = anoFormacao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
