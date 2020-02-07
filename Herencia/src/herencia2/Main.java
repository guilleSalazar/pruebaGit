package herencia2;

public class Main {

	public static void main(String[] args) {

		//CON ARRAY
		Persona[] personas = new Persona[2];

		personas[0] = new Persona("Joselu", "Florenzi", "12345678A");
		personas[1] = new Alumno("Pedro", "Picapiedra", "531564B", "Derecho", 21365);

		for (Persona e : personas) {
			System.out.println(e.getDatos());
		}
		
		
		
		
//SIN ARRAY
		/*
		 * Persona persona1=new Persona("Joselu", "Florenzi", "12345678A"); Alumno
		 * alumno1=new Alumno("Pedro", "Picapiedra", "531564B", "Derecho", 21365);
		 * 
		 * System.out.println(persona1.getDatos());
		 * System.out.println(alumno1.getDatos()+alumno1.getdatosAlumno());
		 */
	}

}
