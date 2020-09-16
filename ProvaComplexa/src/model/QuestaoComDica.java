package model;

// Classe filho

public class QuestaoComDica extends QuestaoSimples {
	
	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	
	public String apresentarQuestao() {
		return super.enunciado+ " - Dica: "+dica;
	}
	

	public boolean corrigir(String respostaAluno) {
		return resposta.equalsIgnoreCase(respostaAluno);

	}	
	
	

}
