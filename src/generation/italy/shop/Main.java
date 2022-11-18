package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("Cacca", "Cacchise", 1000);
		
		System.out.println(p1);
		
		System.out.println(p1.getPrezzoIva());
		
		Prodotto p2 = new Televisore("Televisore", "Televisione", 1000, "40 pollici", true);
		
		System.out.println(p2);
	
	}
}
