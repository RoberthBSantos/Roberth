package models;

public class Jornalista {

	private String nome, email , senha;
	
	public Jornalista(String nome, String email, String senha){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
}

