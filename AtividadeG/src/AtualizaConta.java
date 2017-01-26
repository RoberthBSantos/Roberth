
public class AtualizaConta{

	private double saldoTotal = 0;
	private double selic;
	
	public AtualizaConta(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo antigo da conta: " + c.getSaldo());
		System.out.println("Saldo atual da conta: " + c.getSaldo() + c.getSaldo() * selic + "\n");
		saldoTotal += c.getSaldo() + c.getSaldo() * selic;
		
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
}
