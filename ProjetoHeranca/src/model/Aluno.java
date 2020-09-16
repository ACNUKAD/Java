package model;

//A classe aluno Amplia/extende/erda o conceito de pessoa
//Aluno tem tudo o que tem em pessoa, mas as suas proprias informações
// classe filha

public class Aluno extends Pessoa{

	private int numMatricula;
	private String curso;
	private int anoFormatura;
	
	public void mostrarInfo() {
		System.out.println("Nome: "+nome+" Email: "+email+" Telefone: "+telefone+ "Matricula: "+numMatricula);
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoFormatura() {
		return anoFormatura;
	}

	public void setAnoFormatura(int anoFormatura) {
		this.anoFormatura = anoFormatura;
	}
	
	
	
}
