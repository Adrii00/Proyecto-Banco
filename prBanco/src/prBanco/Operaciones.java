package prBanco;

public abstract class Operaciones {
	public void Prestamo(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
		}
	
	public void Transferencia(Cuenta c1, Cuenta c2, double cantidad) {
		c2.setSaldo(cantidad+c2.getSaldo());
		c1.setSaldo(c1.getSaldo()-cantidad);
	}
	/**
	 * Metodo para cambiar el estado de una cuenta a bloqueado
	 *Recibe por parametro un objeto de clase Cuenta
	 *No devuelve nada. Cambia el estado del objeto Cuenta a "Bloqueado"
	 */
	public void bloquearCuenta(Cuenta cuenta) {
		cuenta.setEstado("Bloqueada");
	}
	/**
	 * Metodo para cambiar el estado de una cuenta a activada
	 *Recibe por parametro un objeto de clase Cuenta
	 *No devuelve nada. Cambia el estado del objeto Cuenta a "Activada"
	 */
	public void activarCuenta(Cuenta cuenta) {
		cuenta.setEstado("Activada");
	}
	
}
