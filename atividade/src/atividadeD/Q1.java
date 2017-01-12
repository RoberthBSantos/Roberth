package atividadeD;

import javax.swing.JOptionPane;

public class Q1 {
	public static void main(String[] args){
		int n[] = new int [5];
		int aux;
		for (int i = 0; i < 5; i++) {
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota "+ i + ":"));
			
		}
		for(int i = 0; i<5; i++){
			for(int j = 0; j<4; j++){
				if(n[j] > n[j + 1]){
					aux = n[j];
					n[j] = n[j+1];
					n[j+1] = aux;
				}
			}
		}
		for (int i = 0; i < 5; i++){
			System.out.println(n[i]);
		}
	}
}
