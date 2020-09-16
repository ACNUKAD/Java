//onde vou declarar meus atributos e métodos

public class Questao {

	// atributos:
	private String enunciado;
	private String resposta;

	// medoto construtor:
	public Questao(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	String apresentarQuestao() {
		return enunciado;
	}

	boolean corrigir(String respostaAluno) {
		return resposta.equals(respostaAluno);

	}

}
