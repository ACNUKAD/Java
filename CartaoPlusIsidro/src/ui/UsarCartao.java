package ui;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class UsarCartao {
	public static void main(String[] args) {
		
		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[5];  // 5 referencias para a superclasse CartaoPrePago
		
		cartoes[0] = new CartaoPrePago ("Ana Carolina","1234567890",10,2030);
		cartoes[1] = new CartaoPrePago ("Jorge","2345678901",11,2030);
		cartoes[2] = new CartaoCashBack("Thiago","3456789012",11,2030,0);
		cartoes[3] = new CartaoCashBack("Thais","4567890123",12,2030,1);
		cartoes[4] = new CartaoCashBack("Gustavo","5678901234",11,2029,2);
		
		for (CartaoPrePago c: cartoes) {
			c.adicionarCredito(1000);
			System.out.println(c.exibirInfo());
		}
		
		System.out.println("----------------------");
		
		for (CartaoPrePago c: cartoes) {
			c.comprar(100);
			System.out.println(c.exibirInfo());
		}
		
	}
}
