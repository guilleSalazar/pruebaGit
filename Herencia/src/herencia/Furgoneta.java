package herencia;

public class Furgoneta extends Coche {

	private String nombre;
	private int numAsientos, pesoExtra;

	public Furgoneta(String nombre, int numAsientos, int pesoExtra) {
		super(nombre);
		this.numAsientos = numAsientos;
		this.pesoExtra = pesoExtra;

	}
	
	public String getDatosFurgoneta() {
		return "El peso adicional es "+pesoExtra+" y tiene "+numAsientos+ " asientos adicionales";
	}

	


	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public int getPesoExtra() {
		return pesoExtra;
	}

	public void setPesoExtra(int pesoExtra) {
		this.pesoExtra = pesoExtra;
	}
	
	

}
