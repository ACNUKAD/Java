import model.Aluno;
import model.Pessoa;
import model.Professor;

public class SistemaUniversidade {
public static void main(String[] args) {
	
	Pessoa p = new Pessoa();
	Aluno a = new Aluno();
	Professor r = new Professor();
	
	p.setNome("Nome da Pessoa");
	p.setEmail("Email da Pessoa");
	p.setTelefone("Telefone da Pessoa");
	
	a.setNome("nome do aluno");
	a.setEmail("email do aluno");
	a.setTelefone("telefone do aluno");
	a.setNumMatricula(123);
	a.setCurso("computa��o");
	
	
	r.setNome("Nome do Professor");
	r.setEmail("email do professor");
	r.setTelefone("telefone do professor");
	r.setDisciplina("disciplina do professor");
	r.setAnoFormacao("Ano de forma��o do professor");
	
	p.mostrarInfo();
	a.mostrarInfo();
	r.mostrarInfo();
	
	
	
	
	
	
}
	
	
	
}
