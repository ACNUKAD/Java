
public class Empregado {
	
	//Atributos:
	private String nome;
	private String cargo;
	private double salario;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	//método construtor:
	public Empregado (String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	
	//public void imprimir () {
	//	System.out.println("Nome   : " + nome);
	//	System.out.println("Cargo  : " + cargo);
	//	System.out.printf("Salario: R$ %.2f\n", salario);
	//	System.out.printf("Imposto: R$ %.2f\n", calcularImposto());
	//}
	
	
	//public void aumentarSalario(double percentual) {
	//	salario = salario + salario * percentual / 100;
	//}
	
	
	public double calcularImposto() {
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 4500.0) {
			imposto = salario * 0.1;
		} else {
			imposto = 1200.0;
		}
		return imposto;
	}
	
	
	
	
}

	
	


