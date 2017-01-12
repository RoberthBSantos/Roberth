
public class TestaFuncionario {
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		f1.dataEntrada = data;
		data.ano = 2017;
		f1.nome = "Joao";
		f1.salario = 100;
		//f1.recebeAumento(50);
		Funcionario f2 = f1;
		
		
		if (f1 == f2) {
			System.out.println("Iguais!");
		}
		else {
			System.out.println("Diferentes!");
		}
		//System.out.println("Salario atual: " + f1.salario);
		//System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		
		//f1.mostra();
		//f2.mostra();
	}

}
