package principal;

import javax.swing.JOptionPane;

import modelos.Estacionamento;

public class Programa {
	public static void main(String[] args) {
		Estacionamento estacionamento = Estacionamento.getInstance();
		
	String menu = "1- Entrada \n2- Saida \n3- estado \n4- Sair";
	
	while(true) {
		
		int op = Integer.valueOf(JOptionPane.showInputDialog(menu));
		
		switch (op) {
		case 1:
			String placa = JOptionPane.showInputDialog("Informe a placa: ");
			String nome = JOptionPane.showInputDialog("Nome do veiculo: ");
			
			if (estacionamento.entrada(placa,nome) == true){
				int pos = estacionamento.estacionado(placa);
				JOptionPane.showMessageDialog(null, "Carro estacionado na vaga: "+ pos);
			}else{
				JOptionPane.showMessageDialog(null, "Estacionamento cheio ou veiculo já está estacionado.");
			}
			
			break;
		
		case 2:
			placa = JOptionPane.showInputDialog("Informe a placa do veículo: ");
			
			if (estacionamento.saida(placa)){
				JOptionPane.showMessageDialog(null, "Carro removido.");
				
			}else {
				JOptionPane.showMessageDialog(null, "Carro não estacionado.");
			}
			break;
			
		case 3:

			JOptionPane.showMessageDialog(null, estacionamento);
			
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "O programa sera encerrado.");
			return;

		default:
			JOptionPane.showMessageDialog(null, "numero invalido.");
			break;
		}
	}
}

}


