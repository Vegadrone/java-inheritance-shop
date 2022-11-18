package generation.italy.shop;

public class Televisore extends Prodotto {
	
	private String dimensioni;
	private boolean smart;
	
	public Televisore( String nome, String marca, int prezzo, String dimensioni, boolean smart) {
		super(nome, marca, prezzo);
		
		this.dimensioni = dimensioni;
		this.smart = smart; 
	}

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nLe dimensioni del Televisore: " + dimensioni
								+"\nSmart: " + smart;
	}
	
}
