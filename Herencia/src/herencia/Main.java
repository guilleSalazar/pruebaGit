package herencia;

public class Main {

	public static void main(String[] args) {

		
		Coche coche1=new Coche("Renaul");
		Furgoneta furgoneta1=new Furgoneta("Volkswagen", 2, 300);
		
		//
		
		System.out.println(coche1.getDatos());
		System.out.println(furgoneta1.getDatos());
		System.out.println(furgoneta1.getDatosFurgoneta());
	}

}
