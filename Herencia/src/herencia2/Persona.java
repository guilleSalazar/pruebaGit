package herencia2;

public class Persona {

	private String nombre, apellido, dni;
	private int numManos, numPies;

	public Persona(String nombre, String apellido, String dni) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		numManos = 2;
		numPies = 2;
	}
	
	public String getDatos() {
		
		return "La persona se llama: "+nombre+" "+apellido+" con dni: "+dni+" y tiene "+numManos+" manos y "+numPies+" pies";
		
		
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

	public int getNumManos() {
		return numManos;
	}

	public void setNumManos(int numManos) {
		this.numManos = numManos;
	}

	public int getNumPies() {
		return numPies;
	}

	public void setNumPies(int numPies) {
		this.numPies = numPies;
	}

}
