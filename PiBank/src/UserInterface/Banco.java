package UserInterface;

// Apostila HERANÇA - PÁG 3

import Core.Conta;
import Core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		
		Conta c1;
		
		c1 = new Conta("Carol", "455.538.333-18", 2500);
		
		System.out.println(c1.getNumeroConta()+":"+c1.getNomeTitular()+"("+c1.getCpf()+") R$"+c1.getSaldo()); // mostrar os dados
		c1.creditar(1000);																					  // deposita 1.000 reais
		System.out.println(c1.getNumeroConta()+":"+c1.getNomeTitular()+"("+c1.getCpf()+") R$"+c1.getSaldo()); // mostrar novamente com novo saldo
		
		if (c1.debitar(2000)) { 											// verifica se da para debitar 2.000 mil
			System.out.println("Debito efetuado com sucesso");				// se der certo, mensagem Debito efetuado
		}
		else {
			System.out.println("Saldo insuficiente");						// se não deu certo, saldo insuficiente
		}
		System.out.println(c1.getNumeroConta()+":"+c1.getNomeTitular()+"("+c1.getCpf()+") R$"+c1.getSaldo()); // retorna novo saldo com o débito feito ou sem ele
		
		
		
		// CONTA ESPECIAL:
		
		System.out.println();
		ContaEspecial c2;
		c2 = new ContaEspecial("Juliana","222.333.444-55",9876, 500.0f);  // Imputa os dados
		
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite()); //mostra os dados de salto e limite
		c2.creditar(1000);																											// deposita 1.000 reais
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite()); // mostra novo saldo
		if (c2.debitar(800)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		
		if (c2.debitar(500)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.getNumeroConta()+":"+c2.getNomeTitular()+"("+c2.getCpf()+") R$"+c2.getSaldo()+" R$"+c2.getLimite());
		
	}

}