
public class Funcionario {
	Data dataEntrada;
	public String nome;
	public String departamento;
	public double salario;
	public Data ponto;
	public String rg;
	public double anual;
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	double 	calculaGanhoAnual() {
		anual = salario * 12;
		return anual;
	}
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Data de entrada: " + this.ponto);
		System.out.println("RG: "+ this.rg);
	}
	

}
