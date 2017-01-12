package modelos;

public class Veiculo {
	
	String placa;
	String nome;
	
	public Veiculo(String p, String n){
		this.placa = p;
		this.nome = n;
	}
	
	public String toString(){
		return "Veiculo: " + this.placa + " - " + this.nome;
	}
	public String getPlaca(){
		return placa;
	}
	public String getNome(){
		return nome;
	}

}
