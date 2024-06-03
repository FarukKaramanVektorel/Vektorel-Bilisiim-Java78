package ders03062024;

public class SipsakPhoto extends Photo{

	public SipsakPhoto(String marka, String model) {
		super(marka, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takePhoto() {
		System.out.println("Şipşak fotoğraf makinası ile fotoğraf kaydı alındı");
		this.output();
	}

	@Override
	public void output() {
		System.out.println("Fotoğraf anında çıktı yapıldı");
		
	}

}
