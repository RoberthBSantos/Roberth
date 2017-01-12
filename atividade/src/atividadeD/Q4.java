package atividadeD;

import java.util.Random;

public class Q4 {
	public static void main(String[] args){
		Random numero = new Random();
		int par[] = new int[10];
		int impar[] = new int[10];
		int p = 0;
		int i = 0;
		for (int c = 0; c < 10; c++){
			int num =1 + numero.nextInt(20);
			if (num % 2 == 0){
				par[p] = num;
				p++;		
			}
			else{
				impar[i] = num;
				i++;
			}
		}
		System.out.println("Vetor Par: ");
		for (int x = 0; x < par.length; x++){
			System.out.println("[" + x + "] = [" + par[x] + "]" );
		}
		System.out.println("Vetor Impar: ");
		for (int x = 0; x < impar.length; x++){
			System.out.println("[" + x + "] = [" + impar[x] + "]" );
		}
		
	}

}
