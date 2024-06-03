package ders03062024;

public abstract class Photo implements IPhoto{
	private String marka;
	private String model;
	

	public Photo(String marka, String model) {
	
		this.marka = marka;
		this.model = model;
	}



	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
