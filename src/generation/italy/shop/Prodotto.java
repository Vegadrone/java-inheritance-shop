package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	//Definizione delle variabili d'ambiente
	
	private int codProdotto;
	private int prezzo;
	private  int iva;
	
	private String nome;
	private String marca;
	
	//Costruttore
	
	public Prodotto(String nome, String marca, int prezzo){
		
		//Genero un codProdotto raandomico
		Random rnd = new Random();
		
		codProdotto = rnd.nextInt(10000,100000);
		
		//Setto l'iva
		iva = 20;
		
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		
	}

	//Getter e Setter
	
	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodProdotto() {
		return codProdotto;
	}
	

	
	//Metodi
	
	public int getPrezzoIva() {
		return prezzo + (prezzo * iva / 100 );
	}
	
	@Override
	public String toString() {

		return "Nome del prodotto: " + nome
				+ "\nMarca del prodotto: " + marca
				+ "\nCodice del prodotto: " + codProdotto
				+ "\nPrezzo del prodotto: " + prezzo  + " " + "€"
				+"\nPrezzo iva compresa: " + getPrezzoIva()  + " " + "€";
	}
	
}
