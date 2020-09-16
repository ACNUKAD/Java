
public class FolhaDePagamento {
	public static void main(String[] args) {
		
		Empregado lista[]; 
		
		// preciso definir o tamanho dela
		lista = new Empregado[10]; 		

		// criar cada um dos objetos
		lista[0] = new Empregado("Isidro", "Professor", 2000);
		lista[1] = new Empregado("Jose", "Vendedor", 1500);
		lista[2] = new Empregado("Pedro", "Coordenador", 2500);
		lista[3] = new Empregado("Vera", "Diretora", 3000);
		lista[4] = new Empregado("Claudete", "Inspetora", 1800);
		lista[5] = new Empregado("Vicente", "Motorista", 2000);
		lista[6] = new Empregado("Paulo", "Contador", 2300);
		lista[7] = new Empregado("Ana", "Advogada", 3500);
		lista[8] = new Empregado("Caique", "Programador", 2700);
		lista[9] = new Empregado("Priscilla", "Designer", 2000);
		/*
		for (int posicao = 0; posicao < lista.length; posicao++) {
			Empregado e = lista[posicao];  
			// atribuo temporariamente a posição atual da lista para a variável e
			System.out.printf("%-20s %-20s   R$ %8.2f     R$ %8.2f     R$ %8.2f\n", 
					e.getNome(),
					e.getCargo(),
					e.getSalario(),
					e.calcularImposto(),
					e.getSalario() - e.calcularImposto());
		}*/
		
		// outra maneira de percorrer a lista toda (só serve para LISTAS)
		for (Empregado e : lista) {
			System.out.printf("%-20s %-20s   R$ %8.2f     R$ %8.2f     R$ %8.2f\n", 
					e.getNome(),
					e.getCargo(),
					e.getSalario(),
					e.calcularImposto(),
					e.getSalario() - e.calcularImposto());
		}
	}
}
