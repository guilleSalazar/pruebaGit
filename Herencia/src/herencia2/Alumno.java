package herencia2;

public class Alumno extends Persona {

	private String carrera;
	private int nia;

	private String nombre, apellido, dni;

	public Alumno(String nombre, String apellido, String dni, String carrera, int nia) {
		super(nombre, apellido, dni);
		this.carrera = carrera;
		this.nia = nia;

	}
	public String getdatosAlumno() {
		return "Estudia "+carrera+ " y su nia es "+nia;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
