package model;

// Classe filho

public class CartaoCashBack extends CartaoPrePago{

	int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	
	public boolean comprar (double valor) {
		if (saldo >= valor && tipo == 0) {
			saldo = saldo - valor + saldo*0.02;
			return true;
		}
		else if (saldo >= valor && tipo == 0) {
				saldo = saldo - valor + saldo*0.05;
				return true;
		}
		else if (saldo >= valor && tipo == 0) {
			saldo = saldo - valor + saldo*0.05;
		}
		return false;
	}
	
	
	
}
