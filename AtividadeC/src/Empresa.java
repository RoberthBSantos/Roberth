
public class Empresa {
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f) {
		
	}
	public void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("Funcionario na posicao: " + empregados[i].salario);
		}
	}

}
