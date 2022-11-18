package generation.italy.shop;

public class Testing {
		public static void main(String[] args) {
			Prodotto p1 = new Cuffie("Koofeee", "Cufs", 69, true, false, "Rosso" );
			
			System.out.println(p1);
			
			System.out.println("---------------------------");
			
			Prodotto p2 = new Televisore("Televisore", "Televisione", 1000, "40 pollici", true);
			
			System.out.println(p2);
			
			System.out.println("---------------------------");
			
			Prodotto p3 = new Smartphone("Telefone", "Mela", 1400, "IT015485484800", 512);
			
			System.out.println(p3);
	}
	
}
