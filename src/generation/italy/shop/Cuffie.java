package generation.italy.shop;

public class Cuffie extends Prodotto {
	
	private boolean isWireless;
	private boolean isCablato;
	private String colore;
	
	public Cuffie (String nome, String marca, int prezzo, boolean isWireless, boolean isCablato, String colore) {
		super(nome, marca, prezzo);
		
		this.isWireless = isWireless;
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	public String getColor() {
		return colore;
	}

	public void setColor(String colore) {
		this.colore = colore;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nColore: " + colore
								+ "\nWireless: " + isWireless
								+ "\nCon cavo: " + isCablato;
	}
}
