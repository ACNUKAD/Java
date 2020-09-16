package model;

// Super classe - MAE

public class CartaoPrePago {
	
	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		saldo += valor;
	}
	
	public boolean comprar (double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
			else {
				return false;
			}
	}
	
	
	
	
	
	
	
	
	
	
	

}
