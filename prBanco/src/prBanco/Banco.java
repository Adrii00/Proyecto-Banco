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
	/**
	 * Metodo para establecer un nuevo IBAN
	 *Recibe por parametro el nuevo valor
	 *No devuelve nada. Establece ese valor en el atributo iban
	 */
	public void setIban (int nuevoIban) {
		this.iban=nuevoIban;
	}
	/**
	 * Metodo para establecer un nuevo saldo
	 *Recibe por parametro el nuevo saldo
	 *No devuelve nada. Establece el nuevo saldo en el atributo saldo
	 */
	public void setSaldo (double nuevoSaldo) {
		this.saldo=nuevoSaldo;
	}
	/**
	 * Metodo para recibir el valor IBAN
	 *Sin parametros
	 *Devuelve el valor del atributo IBAN.
	 */
	public int getIban() {
		return iban;
	}
	/**
	 * Metodo para recibir el valor saldo
	 *Sin parametros
	 *Devuelve el valor del atributo saldo.
	 */
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Banco [iban=" + iban + ", saldo=" + saldo + "]";
	}
	

	
}
