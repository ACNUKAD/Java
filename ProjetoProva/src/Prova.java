//onde vou declarar minhas vari�veis

import java.util.Scanner;


public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	String resp;
	boolean resultado;
		
	Questao lista[];
	
	lista = new Questao[5];
	
	lista [0] = new Questao("Quanto � 1+1? ","2");
	lista [1] = new Questao("Quanto � 2+1? ","3");
	lista [2] = new Questao("A Carol � empenhada? ", "Sim");
	lista [3] = new Questao("Quantos anos a Carol tem? ", "25");
	lista [4] = new Questao("A Carol � inteligente? ","oh yeah");
	
	for (Questao q : lista) {
		System.out.println(q.apresentarQuestao());
		resp= teclado.nextLine();
		
		resultado = q.corrigir(resp);	
			if (resultado) {
				System.out.println("ACERTOU!");
			}
			else {
				System.out.println("Errou, sinto muito");
			}
	}
	
	
	
	teclado.close();	
	}

}
