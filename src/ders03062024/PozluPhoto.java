package ders03062024;

public class PozluPhoto extends Photo{
	private int poz;
	private int durum=0;

	public PozluPhoto(String marka, String model,int poz) {
		super(marka, model);
		if(poz<24) {
			this.poz=24;
		}else {
			this.poz=poz;
		}
		
	}

	@Override
	public void takePhoto() {
		if(poz<=durum)
		{
			System.out.println("Poz bitti yapı paydos");
		}else {
			System.out.println("Pozlu fotoğraf makinası ile fotoğraf çekildi");
			this.output();
		}
	}

	@Override
	public void output() {
		durum++;
		System.out.println("Poza kayıt yapıldı, kalan poz: "+(poz-durum));
		
		
	}

}
