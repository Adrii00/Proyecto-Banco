package prBanco;

public abstract class Operaciones {
	public void Prestamo(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
		}
	
	public void Transferencia(Cuenta c1, Cuenta c2, double cantidad) {
		c2.setSaldo(cantidad+c2.getSaldo());
		c1.setSaldo(c1.getSaldo()-cantidad);
	}
}
