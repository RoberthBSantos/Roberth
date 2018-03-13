package models;

import java.util.List;

import javax.swing.JOptionPane;

public class Noticia {
	
	private String titulo, redacao, area, importancia;
	private Jornalista jornalista;
	List<Noticia> noticia;
	private int indice;
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getImportancia() {
		return importancia;
	}
	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}
	public String getRedacao() {
		return redacao;
	}
	public void setRedacao(String redacao) {
		this.redacao = redacao;
	} 
	public Jornalista getJornalista() {
		return jornalista;
	}
	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}
	
	public void editarNoticia(Editor editor){
		if (editor.getArea() == this.area){
			System.out.println("Editor autorizado!");
		}
	}
	
	public void publicar(Editor editor, Noticia noticia){
		if (editor.isChefe() == true){
			System.out.println("pode publicar!");
			JOptionPane.showMessageDialog(null, noticia.getTitulo()+"\n"+noticia.getRedacao()+"\n");
			//System.out.println(noticia.getTitulo()+"\n"+noticia.getRedacao()+"\n");
		}
	}
	
	public void criarNoticia(Jornalista jornalista){
		Noticia noticia = new Noticia();
		titulo = JOptionPane.showInputDialog("Qual o titulo da notícia? ");
		redacao = JOptionPane.showInputDialog("Digite a redacao da noticia.");
		area = JOptionPane.showInputDialog("Digite a area da noticia.");
		
		noticia.setTitulo(titulo);
		noticia.setRedacao(redacao);
		noticia.setArea(area);
		noticia.setJornalista(jornalista);
		
		this.noticia.add(this.indice,noticia);
		indice++;
		
	}
}
