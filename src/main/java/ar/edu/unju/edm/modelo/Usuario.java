package ar.edu.unju.edm.modelo;

public class Usuario {
	
	private long dni;
	private String password;
	private String usuario;
	private String apellido;
	
	public Usuario() {

	}

	public Usuario(long dni, String password, String usuario, String apellido) {
		super();
		this.dni = dni;
		this.password = password;
		this.usuario = usuario;
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
