package generation.italy.shop;

public class Smartphone extends Prodotto {
	
	//Variabili d'ambiente
	
	private String codImei;
	private int memoria;
	
	public Smartphone(String nome, String marca, int prezzo, String codImei, int memoria) {
		super(nome, marca, prezzo);
		this.codImei = codImei;
		this.memoria = memoria;
	}

	public String getCodImei() {
		return codImei;
	}

	public void setCodImei(String codImei) {
		this.codImei = codImei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nCodice IMEI: " + codImei
								+"\nMemoria: " + memoria + " " + "GB";
	}
	
}
