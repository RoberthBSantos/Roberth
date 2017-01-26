
public class TestaContas {
	
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		//PRIMEIRO TESTE...
		//c.atualiza(0.01);
		//cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		//System.out.println(c.getSaldo());
		//System.out.println(cc.getSaldo());
		//System.out.println(cp.getSaldo());
		
		//SEGUNDO TESTE...
		
		AtualizaConta ac = new AtualizaConta(0.01);
		
		ac.roda(c);
		ac.roda(cc);
		ac.roda(cp);
		
		System.out.println("Saldo total: " + ac.getSaldoTotal());
	}
}
