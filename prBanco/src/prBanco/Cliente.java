package prBanco;


public class Cliente {
	private String nombre;
	private String apellidos;
	
	public Cliente(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	/**
	 * Metodo para establecer un nuevo nombre
	 *Recibe por parametro el nuevo valor
	 *No devuelve nada. Establece ese valor en el atributo nombre
	 */
	public void setNombre (String nuevoNombre) {
		this.nombre=nuevoNombre;
	}
	/**
	 * Metodo para establecer un nuevo apellido
	 *Recibe por parametro el nuevo apellido
	 *No devuelve nada. Establece el nuevo saldo en el atributo apellidos
	 */
	public void setSaldo (String apellidos) {
		this.apellidos=apellidos;
	}
	
}
