package generation.italy.shop;

public class Cuffie extends Prodotto {
	
	private boolean isWireless;
	private String color;
	
	public Cuffie (String nome, String marca, int prezzo, boolean isWireless, String color) {
		super(nome, marca, prezzo);
		
		this.isWireless = isWireless;
		this.color = color;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
