package prBanco;

public abstract class Operaciones {
	public void Prestamo(Cuenta c, double cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
		}
}
