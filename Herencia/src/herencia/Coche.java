package herencia;

public class Coche {

	private int ruedas, potencia, ancho;
	private String nombre;
	
	public Coche(String nombre) {
		this.nombre=nombre;
		ruedas = 4;
		potencia = 150;
		ancho = 200;

	}
	
	
	public String getDatos() {
		return "Este coche se llama "+nombre+" ,tiene "+ruedas+" ruedas y una potencia de "+potencia+" y un ancho de "+ancho+" centrimetros";
		
	}
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

}
