package prBanco;

/**
 * @author Adri
 *
 */
public class Banco {
	
	private int iban;
	private double saldo;
	
	public Banco(int iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

	public int getIban() {
		return iban;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
