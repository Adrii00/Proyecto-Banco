package prBanco;

/**
 * @author Adri
 *
 */

public class Cuenta {
	
	private int iban;
	private double saldo;
	private String estado;
	
	public Cuenta(int iban, double saldo, String estado) {
		this.iban = iban;
		this.saldo = saldo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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

	
}
