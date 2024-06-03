package ders03062024;

public class DigitalPhoto extends Photo{
	private int hafizaKarti;
	private int durum=0;

	public DigitalPhoto(String marka, String model,int hafizaKarti) {
		super(marka, model);
		if(hafizaKarti<8) {
			this.hafizaKarti=8;
		}else {
			this.hafizaKarti=hafizaKarti;
		}
		
	}

	@Override
	public void takePhoto() {
		if(hafizaKarti<=durum) {
			System.out.println("Hafıza kartı doldu!!!");
		}else {
			System.out.println("Dijital Fotoğraf makiinası ile foto çekildi");
			this.output();
		}
		
		
	}

	@Override
	public void output() {		
		durum++;
		System.out.println("Fotoğraf hafıza kartına kaydedildi, kalan hafıza: "+(hafizaKarti-durum));
		
	}

}
