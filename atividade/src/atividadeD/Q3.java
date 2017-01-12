package atividadeD;

import java.util.Random;

public class Q3 {
	public static void main(String[] args){
		Random valores = new Random();
		int pixels[][] = new int[40][40];
		for (int linha = 0; linha < pixels.length; linha++){
			for (int coluna = 0; coluna < pixels[linha].length; coluna++){
				pixels[linha][coluna] = valores.nextInt(256);
				System.out.println("["+linha+","+coluna+"] = "+ pixels[linha][coluna]);
			}
		}
	}

}
