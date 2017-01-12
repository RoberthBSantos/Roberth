package atividadeD;

import java.util.Random;

import javax.swing.JOptionPane;

public class Q2 {
	public static void main(String[] args){
	String meses[] = {"Janeiro","Fevereiro","Marco","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
	Random mes = new Random();
	JOptionPane.showMessageDialog(null, meses[mes.nextInt(12)]);
	}
}

