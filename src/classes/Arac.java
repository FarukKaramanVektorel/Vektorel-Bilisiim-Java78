package classes;

public class Arac {
	
	private String marka;
	private String model;
	private Motor motor;
	private Lastik[] lastik;
	
	
	
	
	public Arac(String marka, String model, Motor motor) {		
		this.marka = marka;
		this.model = model;
		this.motor = motor;
	}



public String getMarka() {
	return marka;
}
}
